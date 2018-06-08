package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class ReplyRemoved extends DomainEvent {
    String replyId;

    public ReplyRemoved(String replyId) {
        super("okky-reply");
        this.replyId = replyId;
    }
}
