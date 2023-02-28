package com.albgott.supplierservice.shared.domain.event;

import java.util.List;

public interface EventBus {
    void publish(final List<DomainEvent> events);
}
