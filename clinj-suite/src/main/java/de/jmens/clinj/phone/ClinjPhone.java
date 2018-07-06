package de.jmens.clinj.phone;

import static java.util.Collections.emptyList;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.exception.UnexpectedClinjException;
import de.jmens.clinj.model.Credentials;
import de.jmens.clinj.model.phonenumber.Phonenumber;
import de.jmens.clinj.model.phonenumber.QuickdialNumber;
import de.jmens.clinj.phone.builder.OutputDevice;
import de.jmens.clinj.phone.call.Call;
import de.jmens.clinj.phone.call.CallImpl;
import de.jmens.clinj.phone.call.InboundCallImpl;
import de.jmens.clinj.phone.call.InboundCallListener;
import de.jmens.clinj.phone.call.OutboundCall;
import de.jmens.clinj.phone.call.OutboundCallImpl;
import de.jmens.clinj.util.SipUtils;
import de.jmens.sipstack.sip.core.useragent.UserAgent;
import de.jmens.sipstack.sip.transport.SipRequest;
import de.jmens.sipstack.sip.transport.SipResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ClinjPhone extends SipListenerAdapter implements AutoCloseable, CallContainer {

	private static final Logger LOGGER = getLogger(ClinjPhone.class);
	private static final int MAX_RUNNING_CALLS = 1;
	private final List<Phonenumber> incomingNumbers;
	private final List<QuickdialNumber> quickdialNumbers;

	// TODO: Permit public access and implement builder
	public static ClinjPhone getPhone(Credentials credentials, int instances) {
		return new ClinjPhone(credentials, instances);
	}

	//TODO: Permit public access and implement builder
	public static ClinjPhone getPhone(Credentials credentials, int instances, String name, List<Phonenumber> incoming, List<QuickdialNumber> quickdials) {
		return new ClinjPhone(credentials, instances, name, incoming, quickdials);
	}


	private UserAgentManager userAgentManager;
	private Map<UUID, CallImpl> calls = new ConcurrentHashMap<>();
	private List<InboundCallListener> inboundListeners = new ArrayList<>();
	/* currently unused */
	private List<OutputDevice> outputDevices = new ArrayList<>();

	private ClinjPhone(Credentials credentials, int instances) {
		this(credentials, instances, "clinj-phone", emptyList(), emptyList());
	}

	private ClinjPhone(Credentials credentials, String name) {
		this(credentials, 5, name, emptyList(), emptyList());
	}

	private ClinjPhone(Credentials credentials, int instances, String name, List<Phonenumber> incoming, List<QuickdialNumber> quickdials) {
		this.userAgentManager = new UserAgentManager(instances, credentials, name, this);
		this.incomingNumbers = incoming;
		this.quickdialNumbers = quickdials;
	}

	/**
	 * Registers a new {@link InboundCallListener} to this phone, null safe.
	 * {@link InboundCallListener} are triggered in case of incoming calls.
	 */
	public ClinjPhone addInboundListener(InboundCallListener inboundListener) {
		if (inboundListener == null) {
			LOGGER.debug("{} must not be null", InboundCallListener.class.getSimpleName());
			return this;
		}
		inboundListeners.add(inboundListener);
		return this;
	}

	/**
	 * Registers this phone. A phone must be registered to the registrar to be callable.
	 *
	 * @return A CompletableFuture that will be completed if the registrar confirms the registration.
	 * The future holds the {@link SipResponse}-Object the registrar sent.
	 */
	public CompletableFuture<Integer> register() {
		return userAgentManager.register();
	}


	public int registerSynchronous() {
		try {
			return userAgentManager.register().get(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new UnexpectedClinjException(e);
		}
	}

	public OutboundCallImpl newCall(final Phonenumber callee) {
		return newCall(callee.toString());
	}

	public OutboundCallImpl newCall(final String callee) {
		//FIXME: Manager could return empty optional
		final OutboundCallImpl outgoingCall = new OutboundCallImpl(
				userAgentManager.getProxy(),
				callee,
				(unused) -> countRunningCalls() < MAX_RUNNING_CALLS,
				this
		);
		calls.put(outgoingCall.getId(), outgoingCall);
		return outgoingCall;
	}

	public void decommission(Call call) {
		userAgentManager.releaseInstance(call.getUserAgent());
		calls.remove(call.getId());
	}

	private int countRunningCalls() {
		return (int) getCalls()
				.stream()
				.filter(Call::isBusy)
				.count();
	}


	public CompletableFuture<Boolean> shutdown() {
		CompletableFuture<Boolean> result = new CompletableFuture<>();
		calls.values().forEach(call -> {
			call.hangupSynchronous();
			call.shutdown();
		});

		userAgentManager.unregister();

		LOGGER.debug("Shutting down phone");

		result.complete(true);

		return result;
	}

	public Collection<Call> getCalls() {
		return new ArrayList<>(calls.values());
	}

	public Collection<OutboundCall> getOutboundCalls() {
		return calls.values()
				.stream()
				.filter(call -> call instanceof OutboundCallImpl)
				.map(call -> (OutboundCallImpl) call)
				.collect(Collectors.toList());
	}

	public Collection<InboundCall> getInboundCalls() {
		return calls.values()
				.stream()
				.filter(call -> call instanceof InboundCallImpl)
				.map(call -> (InboundCallImpl) call)
				.collect(Collectors.toList());
	}

	@Override
	public void incomingCall(SipRequest sipRequest, SipResponse provResponse) {
		LOGGER.debug("Incoming startSynchronous - Call ID {}", SipUtils.callId(sipRequest));

		//FIXME: Manager could return empty optional
		final InboundCallImpl inboundCall = new InboundCallImpl(
				userAgentManager.getProxy(),
				sipRequest,
				this);

		calls.put(inboundCall.getId(), inboundCall);
		inboundListeners.forEach(listener -> listener.onInboundCall(inboundCall));
	}

	@Override
	public void remoteHangup(SipRequest sipRequest) {
		String callId = SipUtils.callId(sipRequest).toString();

		LOGGER.debug("Remote party hung up - Call ID {}", callId);

		final Optional<CallImpl> maybeCall = calls.values()
				.stream()
				.filter(call -> call.getCallId().equals(callId))
				.findFirst();

		maybeCall.ifPresent(call -> {
			LOGGER.trace("Decomissioning {}", call.getCallId());
			call.remoteHangup(sipRequest);
			decommission(call);
			LOGGER.trace("Remaining calls {}",calls.size());
		});
	}

	@Override
	public void ringing(SipResponse sipResponse) {
		String callId = SipUtils.callId(sipResponse).toString();

		LOGGER.debug("Ringing - Call ID {}", callId);

		for (OutboundCall call : getOutboundCalls()) {
			if (call.getCallId().equals(callId)) {
				if (call instanceof OutboundCallImpl) {
					((OutboundCallImpl) call).fireRemoteRinging(SipUtils.callId(sipResponse).toString());
				}
				return;
			}
		}

		LOGGER.debug("Unknown startSynchronous - Call ID {}", callId);
	}

	@Override
	public void calleePickup(SipResponse sipResponse) {
		String callId = SipUtils.callId(sipResponse).toString();

		LOGGER.debug("Remote pickup - Call ID {}", callId);

		LOGGER.debug("Calls: {}", getCalls());

		for (OutboundCall call : getOutboundCalls()) {
			if (call.getCallId().equals(callId)) {
				((OutboundCallImpl) call).fireRemotePickUp();
				return;
			}
		}

		LOGGER.debug("Unknown call - Call ID {}", callId);

	}

	@Override
	public void registering(SipRequest sipRequest) {
		LOGGER.debug("Registering");
	}

	@Override
	public void registerSuccessful(SipResponse sipResponse) {
		LOGGER.debug("Registered successful");
	}

	@Override
	public void registerFailed(SipResponse sipResponse) {
		LOGGER.debug("Failed to register");
	}

	@Override
	public void error(SipResponse sipResponse) {
		LOGGER.debug("Processing error event: {}", sipResponse);
	}

	@Override
	public void close() throws Exception {
		shutdown();
	}

	public List<OutputDevice> getOutputDevices() {
		return Collections.unmodifiableList(outputDevices);
	}

	public Optional<OutboundCall> getOutboundCall(String callId) {
		return find(callId, getOutboundCalls());
	}

	public Optional<InboundCall> getInboundCall(String callId) {
		return find(callId, getInboundCalls());
	}

	public Optional<Call> getCall(String callId) {
		return find(callId, getCalls());
	}

	private <T extends Call> Optional<T> find(String callid, Collection<T> calls) {
		return calls
				.stream()
				.filter(c -> c.getCallId().equals(callid))
				.findFirst();
	}

	public String getName() {
		return userAgentManager.getName();
	}

	public List<Phonenumber> getIncomingNumbers() {
		return new ArrayList<>(incomingNumbers);
	}

	public List<QuickdialNumber> getQuickdialNumbers() {
		return new ArrayList<>(quickdialNumbers);
	}

	Set<UserAgent> getUserAgents() {
		return userAgentManager.getUserAgents();
	}
}
