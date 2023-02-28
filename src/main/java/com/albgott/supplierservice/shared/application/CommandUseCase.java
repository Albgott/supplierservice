package com.albgott.supplierservice.shared.application;

public interface CommandUseCase<C> {
    void exec(C command);
}
