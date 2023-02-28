package com.albgott.supplierservice.shared.application;

public interface QueryUseCase<Q, R> {
    R exec(Q query);
}
