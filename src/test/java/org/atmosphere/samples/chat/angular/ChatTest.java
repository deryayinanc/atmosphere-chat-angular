package org.atmosphere.samples.chat.angular;

import org.atmosphere.cpr.AtmosphereFramework;
import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.AtmosphereResourceEvent;
import org.atmosphere.cpr.DefaultBroadcasterFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.Mockito.mock;

/**
 * Created by derya on 19/02/14.
 */
public class ChatTest {

    private AtmosphereResource ar;
    private Chat chat;
    private AtmosphereResourceEvent are;
    private ChatMessage chatMessage;
    private static Logger logger = LoggerFactory.getLogger(Chat.class);

    @Before
    public void setUp() throws Exception {
        ar = mock(AtmosphereResource.class);
        are = mock(AtmosphereResourceEvent.class);

        /* Initialize ChatMessage final class with mock values
        *
        * */
        chatMessage = new ChatMessage();
        chatMessage.setMessage("test");
        chatMessage.setAuthor("test");
        chatMessage.setTime(0);

        chat = new Chat();

    }

    @After
    public void tearDown() throws Exception {
        ar.close();


    }

    @Test
    public void testOnReady() throws Exception {

        chat.onReady(ar);

    }

    @Test
    public void testOnDisconnect() throws Exception {
        chat.onDisconnect(are);
    }

    @Test
    public void testOnMessage() throws Exception {
        chat.onMessage(chatMessage);
    }
}
