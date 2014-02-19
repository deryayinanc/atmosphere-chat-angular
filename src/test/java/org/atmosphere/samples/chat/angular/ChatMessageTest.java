package org.atmosphere.samples.chat.angular;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by derya on 18/02/14.
 */
public class ChatMessageTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetMessage() throws Exception {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setMessage("test");
        Assert.assertEquals("test",chatMessage.getMessage());
    }

    @Test
    public void testSetMessage() throws Exception {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setMessage("test");
        Assert.assertEquals("test",chatMessage.getMessage());
    }

    @Test
    public void testGetAuthor() throws Exception {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setAuthor("test");
        Assert.assertEquals("test",chatMessage.getAuthor());
    }

    @Test
    public void testSetAuthor() throws Exception {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setAuthor("test");
        Assert.assertEquals("test",chatMessage.getAuthor());
    }

    @Test
    public void testGetTime() throws Exception {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setTime(0);
        Assert.assertEquals(0, chatMessage.getTime());
    }

    @Test
    public void testSetTime() throws Exception {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setTime(0);
        Assert.assertEquals(0,chatMessage.getTime());
    }
}
