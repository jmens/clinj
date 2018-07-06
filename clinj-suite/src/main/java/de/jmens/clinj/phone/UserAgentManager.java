package de.jmens.clinj.phone;

import static java.text.MessageFormat.format;
import static java.util.Collections.unmodifiableMap;
import static java.util.concurrent.CompletableFuture.*;
import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.exception.UnexpectedClinjException;
import de.jmens.clinj.model.Credentials;
import de.jmens.sipstack.sip.core.useragent.SipListener;
import de.jmens.sipstack.sip.core.useragent.UserAgent;
import de.jmens.sipstack.sip.core.useragent.UserAgentImpl;
import de.jmens.sipstack.sip.core.useragent.UserAgentProxy;
import de.jmens.sipstack.sip.transport.SipResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class UserAgentManager {

	private static final Logger LOGGER = getLogger(UserAgentManager.class);
	private final String name;

	private final int id;
	private static int userAgentManagers = 0;

	private SipListener masterListener;
	private UserAgent masterAgent;

	private enum State {
		AVAILABLE, IN_USE
	}

	private final Map<UserAgent, State> userAgents;

	public UserAgentManager(int instances, Credentials credentials, String name, SipListener masterListener) {

		this.id = ++userAgentManagers;
		this.name = name;

		if (instances < 1) {
			throw new IllegalArgumentException("instances must be greater than 0");
		}

		this.masterListener = masterListener;

		userAgents = IntStream.range(0, instances)
				.boxed()
				.map(i -> UserAgentFactory.initUserAgent(credentials, null, format("{0}-{1}", name, i)))
				.filter(Optional::isPresent)
				.map(Optional::get)
				.collect(Collectors.toConcurrentMap(userAgent -> userAgent, userAgent -> State.AVAILABLE));

		if (userAgents.size() != instances) {
			throw new UnexpectedClinjException(format("Failed to initialize UserAgentManager. {0,number,#} agents requested, {1,number,#} came up", instances, userAgents.size()));
		}

		masterAgent = userAgents.keySet().iterator().next();
		masterAgent.addSipListener(masterListener);
	}

	public UserAgent getProxy() {
		return new UserAgentProxy(this);
	}

	public CompletableFuture<Integer> register() {
		final List<CompletableFuture<SipResponse>> registerFutures = getUserAgents()
				.stream()
				.map(UserAgent::register)
				.collect(Collectors.toList());

		return allOf(registerFutures.toArray(new CompletableFuture[registerFutures.size()]))
				.thenApply(unused -> registerFutures.size());
	}


	public CompletionStage<Void> unregister() {
		return supplyAsync(() -> {
			getUserAgents().forEach(UserAgent::unregister);
			return null;
		});
	}

	public Optional<UserAgent> getInstance() {
		synchronized (this) {

			LOGGER.info("UserAgentManager ({}) Useragent requestet, current state: {}", id, getStats());

			final Optional<UserAgent> maybeUseragent = userAgents
					.entrySet()
					.stream()
					.filter(entry -> entry.getValue() == State.AVAILABLE)
					.findFirst()
					.map(Entry::getKey);

			maybeUseragent.ifPresent(userAgent -> {
				userAgents.put(userAgent, State.IN_USE);
				LOGGER.debug("Assigned useragent ({}) {}", id, userAgent.getName());
				LOGGER.debug("Stats ({}): {}", id, getStats());
			});

			return maybeUseragent;
		}
	}

	public synchronized void releaseInstance(UserAgent userAgent) {
		// TODO: Make sure that the agent is in idle state
		synchronized (this) {
			if (userAgent instanceof UserAgentProxy) {
				((UserAgentProxy) userAgent).getInternal().ifPresent(agent -> userAgents.put(agent, State.AVAILABLE));
				LOGGER.debug("Released proxied useragent ({}) {} - stats: {}", id, userAgent.getName(), getStats());
			} else if (userAgent instanceof UserAgentImpl) {
				userAgents.put(userAgent, State.AVAILABLE);
				LOGGER.debug("Released proxied useragent ({}) {} - stats: {}", id, userAgent.getName(), getStats());
			} else {
				LOGGER.error("Unexpected Useragent. Cannot release.");
			}
		}

	}

	private Map<State, List<String>> getStats() {
		Map<State, List<String>> result = Arrays
				.stream(State.values())
				.collect(Collectors.toMap(state -> state, state -> new ArrayList<>()));

		for (Entry<UserAgent, State> entry : userAgents.entrySet()) {
			result.get(entry.getValue()).add(entry.getKey().getName());
		}

		return unmodifiableMap(result);
	}

	public Set<UserAgent> getUserAgents() {
		return userAgents.keySet();
	}

	public String getName() {
		return name;
	}
}
