package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;

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
}
