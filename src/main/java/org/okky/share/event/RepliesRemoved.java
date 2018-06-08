package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class RepliesRemoved extends DomainEvent {
    List<String> replyIds;

    public RepliesRemoved(List<String> replyIds) {
        super("okky-reply");
        this.replyIds = replyIds;
    }
}
