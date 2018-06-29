package org.okky.share;

import org.okky.share.event.DomainEvent;

public interface TopicUtil {
    static String toTopicName(DomainEvent event) {
        return "okky-" + event.getClass().getSimpleName();
    }
}
