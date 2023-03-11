package com.albgott.supplierservice.supplier.infrastructure;

import com.albgott.supplierservice.supplier.domain.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaSupplierRepository extends JpaRepository<Supplier, UUID> {
    boolean existsByCompanyNameIgnoreCaseAndBusinessId(String name, UUID businessId);
}
