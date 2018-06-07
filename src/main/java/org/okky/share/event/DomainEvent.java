package org.okky.share.event;

import static java.lang.System.currentTimeMillis;

public abstract class DomainEvent {
    protected long publishedOn = currentTimeMillis();
}
