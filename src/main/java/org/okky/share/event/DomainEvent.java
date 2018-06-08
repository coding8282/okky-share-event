package org.okky.share.event;

import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import static java.lang.System.currentTimeMillis;
import static lombok.AccessLevel.PROTECTED;

@NoArgsConstructor(access = PROTECTED)
@FieldDefaults(level = PROTECTED)
@Getter
public abstract class DomainEvent {
    long publishedOn;
    String eventName;
    String context;

    protected DomainEvent(String context) {
        publishedOn = currentTimeMillis();
        eventName = this.getClass().getTypeName();
        this.context = context;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
