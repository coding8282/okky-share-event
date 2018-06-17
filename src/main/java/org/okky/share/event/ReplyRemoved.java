package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.okky.share.JsonUtil;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class ReplyRemoved extends DomainEvent {
    String id;

    public ReplyRemoved(String id) {
        super("okky-reply");
        this.id = id;
    }

    public static void main(String[] args) {
        System.out.println(JsonUtil.toPrettyJson(sample()));
    }

    public static ReplyRemoved sample() {
        ReplyRemoved sample = new ReplyRemoved("r-1");
        return sample;
    }
}
