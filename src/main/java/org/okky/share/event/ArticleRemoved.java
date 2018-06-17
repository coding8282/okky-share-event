package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.okky.share.JsonUtil;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class ArticleRemoved extends DomainEvent {
    String articleId;

    public ArticleRemoved(String articleId) {
        super("okky-article");
        this.articleId = articleId;

    }

    public static void main(String[] args) {
        System.out.println(JsonUtil.toPrettyJson(sample()));
    }

    public static ArticleRemoved sample() {
        ArticleRemoved sample = new ArticleRemoved("a-1");
        return sample;
    }
}
