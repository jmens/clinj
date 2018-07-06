/*
    This file is part of Peers, a java SIP softphone.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2007, 2008, 2009, 2010 Yohann Martineau
*/

package de.jmens.sipstack.sip.core.useragent;

import static org.slf4j.LoggerFactory.getLogger;

import de.jmens.clinj.annotation.SingleUsage;
import de.jmens.clinj.exception.RegisterFailedException;
import de.jmens.clinj.phone.SipListenerAdapter;
import de.jmens.sipstack.Config;
import de.jmens.sipstack.FileLogger;
import de.jmens.sipstack.Logger;
import de.jmens.sipstack.media.AbstractSoundManager;
import de.jmens.sipstack.media.Echo;
import de.jmens.sipstack.media.MediaManager;
import de.jmens.sipstack.media.MediaMode;
import de.jmens.sipstack.sdp.SDPManager;
import de.jmens.sipstack.sip.core.useragent.handlers.ByeHandler;
import de.jmens.sipstack.sip.core.useragent.handlers.CancelHandler;
import de.jmens.sipstack.sip.core.useragent.handlers.InviteHandler;
import de.jmens.sipstack.sip.core.useragent.handlers.OptionsHandler;
import de.jmens.sipstack.sip.core.useragent.handlers.RegisterHandler;
import de.jmens.sipstack.sip.syntaxencoding.SipURI;
import de.jmens.sipstack.sip.syntaxencoding.SipUriSyntaxException;
import de.jmens.sipstack.sip.transaction.Transaction;
import de.jmens.sipstack.sip.transaction.TransactionManager;
import de.jmens.sipstack.sip.transactionuser.Dialog;
import de.jmens.sipstack.sip.transactionuser.DialogManager;
import de.jmens.sipstack.sip.transport.SipMessage;
import de.jmens.sipstack.sip.transport.SipRequest;
import de.jmens.sipstack.sip.transport.SipResponse;
import de.jmens.sipstack.sip.transport.TransportManager;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class UserAgentImpl implements UserAgent {

	private static final org.slf4j.Logger LOGGER = getLogger(UserAgentImpl.class);

	private Logger logger;
	private Config config;

	private List<String> peers;

	//TODO factorize echo and captureRtpSender
	private Echo echo;

	private UAC uac;
	private UAS uas;

	private ChallengeManager challengeManager;

	private DialogManager dialogManager;
	private TransactionManager transactionManager;
	private TransportManager transportManager;

	private int cseqCounter;

	private List<SipListener> sipListeners = new ArrayList<>();
	private List<CompletableFuture<SipResponse>> registerFutures = new ArrayList<>();

	private SDPManager sdpManager;
	private AbstractSoundManager soundManager;
	private MediaManager mediaManager;

	private boolean busy;
	private String name;

	public UserAgentImpl(SipListener sipListener,
			Logger logger, AbstractSoundManager soundManager, String name)
			throws SocketException {
		this(sipListener, null, logger, soundManager, name);
	}

	public UserAgentImpl(SipListener sipListener, Config config, Logger logger, AbstractSoundManager soundManager, String name) throws SocketException {
		this.name = name;
		if (sipListener != null) {
			sipListeners.add(sipListener);
		}

		if (logger == null) {
			logger = new FileLogger("/tmp");
		}

		this.logger = logger;

		this.config = config;

		cseqCounter = 1;

		StringBuffer buf = new StringBuffer();
		buf.append("starting user agent [");
		buf.append("myAddress: ");
		buf.append(config.getLocalInetAddress().getHostAddress()).append(", ");
		buf.append("sipPort: ");
		buf.append(config.getSipPort()).append(", ");
		buf.append("userpart: ");
		buf.append(config.getUserPart()).append(", ");
		buf.append("domain: ");
		buf.append(config.getDomain()).append("]");
		logger.info(buf.toString());

		//transaction user

		dialogManager = new DialogManager(logger);

		//transaction

		transactionManager = new TransactionManager(logger);

		//transport

		transportManager = new TransportManager(transactionManager,
				config, logger);

		transactionManager.setTransportManager(transportManager);

		//core

		InviteHandler inviteHandler = new InviteHandler(this,
				dialogManager,
				transactionManager,
				transportManager,
				logger);
		CancelHandler cancelHandler = new CancelHandler(this,
				dialogManager,
				transactionManager,
				transportManager,
				logger);
		ByeHandler byeHandler = new ByeHandler(this,
				dialogManager,
				transactionManager,
				transportManager,
				logger);
		OptionsHandler optionsHandler = new OptionsHandler(this,
				transactionManager,
				transportManager,
				logger);
		RegisterHandler registerHandler = new RegisterHandler(this,
				transactionManager,
				transportManager,
				logger);

		InitialRequestManager initialRequestManager =
				new InitialRequestManager(
						this,
						inviteHandler,
						cancelHandler,
						byeHandler,
						optionsHandler,
						registerHandler,
						dialogManager,
						transactionManager,
						transportManager,
						logger);
		MidDialogRequestManager midDialogRequestManager =
				new MidDialogRequestManager(
						this,
						inviteHandler,
						cancelHandler,
						byeHandler,
						optionsHandler,
						registerHandler,
						dialogManager,
						transactionManager,
						transportManager,
						logger);

		uas = new UAS(this,
				initialRequestManager,
				midDialogRequestManager,
				dialogManager,
				transactionManager,
				transportManager);

		uac = new UAC(this,
				initialRequestManager,
				midDialogRequestManager,
				dialogManager,
				transactionManager,
				transportManager,
				logger);

		challengeManager = new ChallengeManager(config,
				initialRequestManager,
				midDialogRequestManager,
				dialogManager,
				logger);
		registerHandler.setChallengeManager(challengeManager);
		inviteHandler.setChallengeManager(challengeManager);
		byeHandler.setChallengeManager(challengeManager);

		peers = new ArrayList<String>();
		//dialogs = new ArrayList<Dialog>();

		sdpManager = new SDPManager(this, logger);
		inviteHandler.setSdpManager(sdpManager);
		optionsHandler.setSdpManager(sdpManager);
		this.soundManager = soundManager;
		mediaManager = new MediaManager(this, logger);
	}


	@Override
	public void addSipListener(SipListener sipListener) {
		this.sipListeners.add(sipListener);
	}

	public void removeSipListener(SipListener sipListener) {
		this.sipListeners.remove(sipListener);
	}

	// client methods

	public void close() {
		try {
			transportManager.closeTransports();
			config.setPublicInetAddress(null);
		} finally {
			busy = false;
		}
	}

	public CompletableFuture<SipResponse> register() {
		final CompletableFuture<SipResponse> future = new CompletableFuture<>();

		synchronized (registerFutures) {
			registerFutures.add(future);
		}

		uac.register();

		//TODO: Timeout auf Future

		return future;
	}

	public void unregister() {
		try {
			uac.unregister();
		} catch (SipUriSyntaxException e) {
			LOGGER.warn("Failed to unregister: {}", e.getMessage());
		}
	}

	public SipRequest invite(String requestUri, String callId) throws SipUriSyntaxException {
		busy = true;
		return uac.invite(requestUri, callId);
	}

	public void terminate(SipRequest sipRequest) {
		try {
			uac.terminate(sipRequest);
		} finally {
			busy = false;
		}
	}

	public void acceptCall(SipRequest sipRequest, Dialog dialog) {
		busy = true;
		uas.acceptCall(sipRequest, dialog);
	}

	public void rejectCall(SipRequest sipRequest) {
		uas.rejectCall(sipRequest);
	}


	/**
	 * Gives the sipMessage if sipMessage is a SipRequest or
	 * the SipRequest corresponding to the SipResponse
	 * if sipMessage is a SipResponse
	 *
	 * @return null if sipMessage is neither a SipRequest neither a SipResponse
	 */
	public SipRequest getSipRequest(SipMessage sipMessage) {
		if (sipMessage instanceof SipRequest) {
			return (SipRequest) sipMessage;
		} else if (sipMessage instanceof SipResponse) {
			SipResponse sipResponse = (SipResponse) sipMessage;
			Transaction transaction = (Transaction) transactionManager
					.getClientTransaction(sipResponse);
			if (transaction == null) {
				transaction = (Transaction) transactionManager
						.getServerTransaction(sipResponse);
			}
			if (transaction == null) {
				return null;
			}
			return transaction.getRequest();
		} else {
			return null;
		}
	}

//    public List<Dialog> getDialogs() {
//        return dialogs;
//    }

	public List<String> getPeers() {
		return peers;
	}

//    public Dialog getDialog(String peer) {
//        for (Dialog dialog : dialogs) {
//            String remoteUri = dialog.getRemoteUri();
//            if (remoteUri != null) {
//                if (remoteUri.contains(peer)) {
//                    return dialog;
//                }
//            }
//        }
//        return null;
//    }

	public String generateCSeq(String method) {
		StringBuffer buf = new StringBuffer();
		buf.append(cseqCounter++);
		buf.append(' ');
		buf.append(method);
		return buf.toString();
	}

	public boolean isRegistered() {
		return uac.getInitialRequestManager().getRegisterHandler()
				.isRegistered();
	}

	@Override
	public String getName() {
		return name;
	}

	public UAS getUas() {
		return uas;
	}

	public UAC getUac() {
		return uac;
	}

	public DialogManager getDialogManager() {
		return dialogManager;
	}

	public int getSipPort() {
		return transportManager.getSipPort();
	}

	public int getRtpPort() {
		return config.getRtpPort();
	}

	public String getDomain() {
		return config.getDomain();
	}

	public String getUserpart() {
		return config.getUserPart();
	}

	public MediaMode getMediaMode() {
		return config.getMediaMode();
	}

	public boolean isMediaDebug() {
		return config.isMediaDebug();
	}

	public SipURI getOutboundProxy() {
		return config.getOutboundProxy();
	}

	public Echo getEcho() {
		return echo;
	}

	public void setEcho(Echo echo) {
		this.echo = echo;
	}

	public List<SipListener> getSipListener() {
		return sipListeners;
	}

	public AbstractSoundManager getSoundManager() {
		return soundManager;
	}

	public MediaManager getMediaManager() {
		return mediaManager;
	}

	public Config getConfig() {
		return config;
	}

	public TransportManager getTransportManager() {
		return transportManager;
	}

	public void notifyRemoteHangup(SipRequest sipRequest) {
		notifyListeners(l -> l.remoteHangup(sipRequest));
	}

	public void notifyRegistering(SipRequest sipRequest) {
		notifyListeners(l -> l.registering(sipRequest));
	}

	public void notifyIncomingCall(SipRequest sipRequest, SipResponse sipResponse) {
		notifyListeners(l -> l.incomingCall(sipRequest, sipResponse));
	}

	public void noitfyError(SipResponse sipResponse) {
		notifyListeners(l -> l.error(sipResponse));
	}

	public void notifyRinging(SipResponse sipResponse) {
		notifyListeners(l -> l.ringing(sipResponse));
	}

	public void notifyRemotePickup(SipResponse sipResponse) {
		notifyListeners(l -> l.calleePickup(sipResponse));
	}

	public void notifyRegisterFailed(SipResponse sipResponse) {
		notifyListeners(l -> {
			l.registerFailed(sipResponse);
			synchronized (registerFutures) {
				registerFutures.forEach(future -> future.completeExceptionally(new RegisterFailedException(sipResponse)));
				registerFutures.clear();
			}
		});
	}

	public void notifyRegisterSuccessfull(SipResponse sipResponse) {
		notifyListeners(l -> l.registerSuccessful(sipResponse));
		synchronized (registerFutures) {
			registerFutures.forEach(future -> future.complete(sipResponse));
			registerFutures.clear();
		}
	}

	private synchronized void notifyListeners(Consumer<? super SipListener> consumer) {
		final List<SipListener> singleUsageListeners = sipListeners
				.stream()
				.peek(consumer)
				.filter(listener -> listener.getClass().isAnnotationPresent(SingleUsage.class))
				.collect(Collectors.toList());

		sipListeners.removeAll(singleUsageListeners);
	}

	public boolean isBusy() {
		return busy;
	}

	private static class RegisterListener extends SipListenerAdapter {

		private CompletableFuture<SipResponse> future;

		private RegisterListener(CompletableFuture<SipResponse> future) {
			this.future = future;
		}

		@Override
		public void registerSuccessful(SipResponse sipResponse) {
			LOGGER.debug("Registered successful. Notifiing listeners.");
			future.complete(sipResponse);
		}

		@Override
		public void registerFailed(SipResponse sipResponse) {
			LOGGER.debug("Failed to register. Notifiing listeners.");
			future.completeExceptionally(new RegisterFailedException(sipResponse));
		}
	}
}
