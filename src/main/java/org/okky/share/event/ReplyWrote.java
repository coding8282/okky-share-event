package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.okky.share.JsonUtil;

import static java.lang.System.currentTimeMillis;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class ReplyWrote extends DomainEvent {
    String id;
    String articleId;
    String body;
    String replierId;
    String replierName;
    long repliedOn;
    Long updatedOn;
    Long acceptedOn;

    public ReplyWrote(String id, String articleId, String body, String replierId, String replierName, long repliedOn, Long updatedOn, Long acceptedOn) {
        super("okky-reply");
        this.id = id;
        this.articleId = articleId;
        this.body = body;
        this.replierId = replierId;
        this.replierName = replierName;
        this.repliedOn = repliedOn;
        this.updatedOn = updatedOn;
        this.acceptedOn = acceptedOn;
    }

    // ---------------------------------------------------
    public static void main(String[] args) {
        System.out.println(JsonUtil.toPrettyJson(sample()));
    }

    public static ReplyWrote sample() {
        String id = "r-1";
        String articleId = "a-1";
        String body = "내용";
        String replierId = "m-1";
        String replierName = "coding8282";
        long repliedOn = currentTimeMillis();
        Long updatedOn = null;
        Long acceptedOn = null;
        ReplyWrote event = new ReplyWrote(id, articleId, body, replierId, replierName, repliedOn, updatedOn, acceptedOn);
        return event;
    }
}
