package org.okky.share;

import org.junit.Test;
import org.okky.share.event.RepliesRemoved;
import org.okky.share.event.ReplyPinned;

import static java.lang.System.currentTimeMillis;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TopicUtilTest {
    @Test
    public void toTopicName_토픽명은_okky_로_시작해야_함() {
        ReplyPinned sample = new ReplyPinned("r", "a", "r", "rn", "pm", currentTimeMillis());
        String topicName = TopicUtil.toTopicName(sample);

        assertThat("토픽 접두사는 okky-이다.", topicName, startsWith("okky-"));
    }

    @Test
    public void toTopicName_토픽명_확인() {
        ReplyPinned sample = new ReplyPinned("r", "a", "r", "rn", "pm", currentTimeMillis());
        String topicName = TopicUtil.toTopicName(sample);

        assertEquals("토픽 이름이 틀린다.", "okky-ReplyPinned", topicName);
    }

    @Test
    public void toTopicName_토픽명_확인2() {
        RepliesRemoved sample = RepliesRemoved.sample();
        String topicName = TopicUtil.toTopicName(sample);

        assertEquals("토픽 이름이 틀린다.", "okky-RepliesRemoved", topicName);
    }
}