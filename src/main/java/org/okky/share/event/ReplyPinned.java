package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.okky.share.JsonUtil;

import static java.lang.System.currentTimeMillis;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class ReplyPinned extends DomainEvent {
    String id;
    String articleId;
    String replierId;
    String replierName;
    String pinMemo;
    long pinnedOn;

    public ReplyPinned(String id, String articleId, String replierId, String replierName, String pinMemo, long pinnedOn) {
        super("okky-reply");
        this.id = id;
        this.articleId = articleId;
        this.replierId = replierId;
        this.replierName = replierName;
        this.pinMemo = pinMemo;
        this.pinnedOn = pinnedOn;
    }

    // ---------------------------------------------------
    public static void main(String[] args) {
        System.out.println(JsonUtil.toPrettyJson(sample()));
    }

    public static ReplyPinned sample() {
        String id = "r-1";
        String articleId = "a-1";
        String replierId = "m-1";
        String replierName = "coding8282";
        String pinMemo = "너무 좋은 답글이네요 고정합니다 ^_^";
        long pinnedOn = currentTimeMillis();
        return new ReplyPinned(id, articleId, replierId, replierName, pinMemo, pinnedOn);
    }
}
