package org.atmosphere.samples.chat.angular;

import org.junit.Assert;

/**
 * Created by derya on 18/02/14.
 */
public class ChatMessageEncoderDecoderTest {



    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testDecode() throws Exception {

        ChatMessageEncoderDecoder chatMessageEncoderDecoder = new ChatMessageEncoderDecoder();
        ChatMessage chatMessage = chatMessageEncoderDecoder.decode("{\"message\":\"test\",\"author\":\"test\",\"time\":0}");

        Assert.assertEquals("test", chatMessage.getMessage());
        Assert.assertEquals("test", chatMessage.getAuthor());
        Assert.assertEquals(0, chatMessage.getTime());

    }

    @org.junit.Test
    public void testEncode() throws Exception {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setMessage("test");
        chatMessage.setAuthor("test");
        chatMessage.setTime(0);

        ChatMessageEncoderDecoder chatMessageEncoderDecoder = new ChatMessageEncoderDecoder();

        Assert.assertEquals("{\"message\":\"test\",\"author\":\"test\",\"time\":0}",chatMessageEncoderDecoder.encode(chatMessage));

    }
}
