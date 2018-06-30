package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;

import static java.lang.System.currentTimeMillis;
import static lombok.AccessLevel.PRIVATE;
import static org.okky.share.JsonUtil.toPrettyJson;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class Emoted extends DomainEvent {
    String id;
    String targetId;
    String memberId;
    long emotedOn;
    String type;

    public Emoted(String id, String targetId, String memberId, long emotedOn, String type) {
        super("okky-like");
        this.id = id;
        this.targetId = targetId;
        this.memberId = memberId;
        this.emotedOn = emotedOn;
        this.type = type;
    }

    // ---------------------------------------------------
    public static void main(String[] args) {
        System.out.println(toPrettyJson(sample()));
    }

    public static Emoted sample() {
        String id = "r-1";
        String targetId = "a-1";
        String memberId = "m-1";
        long emotedOn = currentTimeMillis();
        String type = "LIKE";
        return new Emoted(id, targetId, memberId, emotedOn, type);
    }
}
