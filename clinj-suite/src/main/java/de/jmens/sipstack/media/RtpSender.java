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

    Copyright 2008, 2009, 2010, 2011 Yohann Martineau
*/

package de.jmens.sipstack.media;

import de.jmens.clinj.log.MediaLogger;
import de.jmens.sipstack.rtp.RtpPacket;
import de.jmens.sipstack.rtp.RtpSession;
import de.jmens.sipstack.sdp.Codec;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;

public class RtpSender implements Runnable {

    private static final Logger MEDIA_LOGGER = new MediaLogger();

    private PipedInputStream encodedData;
    private RtpSession rtpSession;
    private boolean isStopped;
    private FileOutputStream rtpSenderInput;
    private boolean mediaDebug;
    private Codec codec;
    private List<RtpPacket> pushedPackets;
    private Logger logger;
    private CountDownLatch latch;

    public RtpSender(PipedInputStream encodedData, RtpSession rtpSession, boolean mediaDebug, Codec codec, CountDownLatch latch) {
        this.encodedData = encodedData;
        this.rtpSession = rtpSession;
        this.mediaDebug = mediaDebug;
        this.codec = codec;
        this.latch = latch;
        this.logger = logger;
        isStopped = false;
        pushedPackets = Collections.synchronizedList(
                new ArrayList<RtpPacket>());
    }

    public void run() {
        RtpPacket rtpPacket = new RtpPacket();
        rtpPacket.setVersion(2);
        rtpPacket.setPadding(false);
        rtpPacket.setExtension(false);
        rtpPacket.setCsrcCount(0);
        rtpPacket.setMarker(false);
        rtpPacket.setPayloadType(codec.getPayloadType());
        Random random = new Random();
        int sequenceNumber = random.nextInt();
        rtpPacket.setSequenceNumber(sequenceNumber);
        rtpPacket.setSsrc(random.nextInt());
        int buf_size = Capture.BUFFER_SIZE / 2;
        byte[] buffer = new byte[buf_size];
        int timestamp = 0;
        int numBytesRead;
        int tempBytesRead;
        long sleepTime = 0;
        long offset = 0;
        long lastSentTime = System.nanoTime();
        // indicate if its the first time that we send a packet (dont wait)
        boolean firstTime = true;

        while (!isStopped) {
            numBytesRead = 0;
            try {
                while (!isStopped && numBytesRead < buf_size) {
                    // expect that the buffer is full
                    tempBytesRead = encodedData.read(buffer, numBytesRead,
                            buf_size - numBytesRead);
                    numBytesRead += tempBytesRead;
                }
            } catch (IOException e) {
                logger.error("input/output error", e);
                return;
            }
            byte[] trimmedBuffer;
            if (numBytesRead < buffer.length) {
                trimmedBuffer = new byte[numBytesRead];
                System.arraycopy(buffer, 0, trimmedBuffer, 0, numBytesRead);
            } else {
                trimmedBuffer = buffer;
            }
            if (mediaDebug) {
                try {
                    rtpSenderInput.write(trimmedBuffer); // TODO use classpath
                } catch (IOException e) {
                    logger.error("cannot write to file", e);
                    break;
                }
            }
            if (pushedPackets.size() > 0) {
                RtpPacket pushedPacket = pushedPackets.remove(0);
                rtpPacket.setMarker(pushedPacket.isMarker());
                rtpPacket.setPayloadType(pushedPacket.getPayloadType());
                rtpPacket.setIncrementTimeStamp(pushedPacket.isIncrementTimeStamp());
                byte[] data = pushedPacket.getData();
                rtpPacket.setData(data);
            } else {
                if (rtpPacket.getPayloadType() != codec.getPayloadType()) {
                    rtpPacket.setPayloadType(codec.getPayloadType());
                    rtpPacket.setMarker(false);
                }
                rtpPacket.setData(trimmedBuffer);
            }

            rtpPacket.setSequenceNumber(sequenceNumber++);
            if (rtpPacket.isIncrementTimeStamp()) {
                    timestamp += buf_size;
                }
            rtpPacket.setTimestamp(timestamp);
            if (firstTime) {
                rtpSession.send(rtpPacket);
                lastSentTime = System.nanoTime();
                firstTime = false;
                continue;
            }
            sleepTime = 19500000 - (System.nanoTime() - lastSentTime) + offset;
            if (sleepTime > 0) {
                try {
                    Thread.sleep(Math.round(sleepTime / 1000000f));
                } catch (InterruptedException e) {
                    logger.error("Thread interrupted", e);
                    return;
                }
                rtpSession.send(rtpPacket);
                lastSentTime = System.nanoTime();
                offset = 0;
            } else {
                rtpSession.send(rtpPacket);
                lastSentTime = System.nanoTime();
                if (sleepTime < -20000000) {
                    offset = sleepTime + 20000000;
                }
            }
        }
        if (mediaDebug) {
            try {
                rtpSenderInput.close();
            } catch (IOException e) {
                logger.error("cannot close file", e);
                return;
            }
        }
        latch.countDown();
        if (latch.getCount() != 0) {
            try {
                latch.await();
            } catch (InterruptedException e) {
                logger.error("interrupt exception", e);
            }
        }
    }

    public synchronized void setStopped(boolean isStopped) {
        this.isStopped = isStopped;
    }

    public void pushPackets(List<RtpPacket> rtpPackets) {
        this.pushedPackets.addAll(rtpPackets);
    }

}
