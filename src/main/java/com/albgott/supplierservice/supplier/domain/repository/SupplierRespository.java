package com.albgott.supplierservice.supplier.domain.repository;

import com.albgott.supplierservice.supplier.domain.model.Supplier;

import java.util.Optional;
import java.util.UUID;

public interface SupplierRespository {
    void save(Supplier supplier);
    void delete(Supplier supplier);
    boolean isNameUsedOnBusiness(String name, UUID businessId);
    Optional<Supplier> findById(UUID id);
}
