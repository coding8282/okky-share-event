package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;

import static java.lang.System.currentTimeMillis;
import static lombok.AccessLevel.PRIVATE;
import static org.okky.share.JsonUtil.toPrettyJson;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class ArticleScrapped extends DomainEvent {
    String id;
    String articleId;
    String scrapperId;
    long scrappedOn;

    public ArticleScrapped(String id, String articleId, String scrapperId, long scrappedOn) {
        super("okky-article");
        this.id = id;
        this.articleId = articleId;
        this.scrapperId = scrapperId;
        this.scrappedOn = scrappedOn;
    }

    // ---------------------------------------------------
    public static void main(String[] args) {
        System.out.println(toPrettyJson(sample()));
    }

    public static ArticleScrapped sample() {
        String id = "r-1";
        String articleId = "a-1";
        String scrapperId = "m-1";
        long scrappedOn = currentTimeMillis();
        return new ArticleScrapped(id, articleId, scrapperId, scrappedOn);
    }
}
