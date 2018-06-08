package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class ArticleRemoved extends DomainEvent {
    String articleId;

    public ArticleRemoved(String articleId) {
        super("okky-article");
        this.articleId = articleId;
    }
}
