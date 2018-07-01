package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;

import static java.lang.System.currentTimeMillis;
import static lombok.AccessLevel.PRIVATE;
import static org.okky.share.JsonUtil.toPrettyJson;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class ReplyCommented extends DomainEvent {
    String id;
    String replyId;
    String body;
    String commenterId;
    String commenterName;
    long commentedOn;
    Long updatedOn;

    public ReplyCommented(String id, String replyId, String body, String commenterId, String commenterName, long commentedOn, Long updatedOn) {
        super("okky-comment");
        this.id = id;
        this.replyId = replyId;
        this.body = body;
        this.commenterId = commenterId;
        this.commenterName = commenterName;
        this.commentedOn = commentedOn;
        this.updatedOn = updatedOn;
    }

    // ---------------------------------------------------
    public static void main(String[] args) {
        System.out.println(toPrettyJson(sample()));
    }

    public static ReplyCommented sample() {
        String id = "r-1";
        String articleId = "a-1";
        String body = "내용";
        String replierId = "m-1";
        String replierName = "coding8282";
        long repliedOn = currentTimeMillis();
        Long updatedOn = null;
        Long acceptedOn = null;
        return new ReplyCommented(id, articleId, body, replierId, replierName, repliedOn, updatedOn);
    }
}
