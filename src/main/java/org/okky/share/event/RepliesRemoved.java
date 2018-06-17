package org.okky.share.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.okky.share.JsonUtil;

import java.util.List;

import static java.util.Arrays.asList;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@Getter
public class RepliesRemoved extends DomainEvent {
    List<String> ids;

    public RepliesRemoved(List<String> ids) {
        super("okky-reply");
        this.ids = ids;
    }

    // ---------------------------------------------------
    public static void main(String[] args) {
        System.out.println(JsonUtil.toPrettyJson(sample()));
    }

    public static RepliesRemoved sample() {
        List<String> ids = asList("r-1,r-2,r-3");
        RepliesRemoved sample = new RepliesRemoved(ids);
        return sample;
    }
}
