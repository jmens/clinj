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

    Copyright 2007, 2008, 2009, 2010, 2012 Yohann Martineau
*/

package de.jmens.sipstack.sip.core.useragent.handlers;

import de.jmens.sipstack.Logger;
import de.jmens.sipstack.sdp.SessionDescription;
import de.jmens.sipstack.sip.RFC3261;
import de.jmens.sipstack.sip.Utils;
import de.jmens.sipstack.sip.core.useragent.UserAgentImpl;
import de.jmens.sipstack.sip.syntaxencoding.SipHeaderFieldName;
import de.jmens.sipstack.sip.syntaxencoding.SipHeaderFieldValue;
import de.jmens.sipstack.sip.syntaxencoding.SipHeaders;
import de.jmens.sipstack.sip.transaction.ServerTransaction;
import de.jmens.sipstack.sip.transaction.ServerTransactionUser;
import de.jmens.sipstack.sip.transaction.TransactionManager;
import de.jmens.sipstack.sip.transport.SipRequest;
import de.jmens.sipstack.sip.transport.SipResponse;
import de.jmens.sipstack.sip.transport.TransportManager;
import java.io.IOException;
import java.util.Random;

public class OptionsHandler extends MethodHandler
        implements ServerTransactionUser {

    public static final int MAX_PORTS = 65536;

    public OptionsHandler(UserAgentImpl userAgent,
            TransactionManager transactionManager,
            TransportManager transportManager, Logger logger) {
        super(userAgent, transactionManager, transportManager, logger);
    }

    public void handleOptions(SipRequest sipRequest) {
        SipResponse sipResponse = buildGenericResponse(sipRequest,
                RFC3261.CODE_200_OK, RFC3261.REASON_200_OK);
        int localPort = new Random().nextInt(MAX_PORTS);
        try {
            SessionDescription sessionDescription =
                sdpManager.createSessionDescription(null, localPort);
            sipResponse.setBody(sessionDescription.toString().getBytes());
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        SipHeaders sipHeaders = sipResponse.getSipHeaders();
        sipHeaders.add(new SipHeaderFieldName(RFC3261.HDR_CONTENT_TYPE),
                new SipHeaderFieldValue(RFC3261.CONTENT_TYPE_SDP));
        sipHeaders.add(new SipHeaderFieldName(RFC3261.HDR_ALLOW),
                new SipHeaderFieldValue(Utils.generateAllowHeader()));
        ServerTransaction serverTransaction =
            transactionManager.createServerTransaction(
                sipResponse, userAgent.getSipPort(), RFC3261.TRANSPORT_UDP,
                this, sipRequest);
        serverTransaction.start();
        serverTransaction.receivedRequest(sipRequest);
        serverTransaction.sendReponse(sipResponse);
    }

    @Override
    public void transactionFailure() {
        // TODO Auto-generated method stub

    }

}
