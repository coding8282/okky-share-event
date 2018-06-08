package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class ReplyRemoved extends DomainEvent {
    String id;

    public ReplyRemoved(String id) {
        super("okky-reply");
        this.id = id;
    }
}
