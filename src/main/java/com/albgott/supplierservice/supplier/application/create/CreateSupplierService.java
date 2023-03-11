package com.albgott.supplierservice.supplier.application.create;

import com.albgott.supplierservice.shared.application.CommandUseCase;
import com.albgott.supplierservice.shared.domain.event.EventBus;
import com.albgott.supplierservice.supplier.domain.event.SupplierCreatedDomainEvent;
import com.albgott.supplierservice.supplier.domain.model.Supplier;
import com.albgott.supplierservice.supplier.domain.repository.SupplierRespository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateSupplierService implements CommandUseCase<CreateSupplierCommand> {

    private final SupplierRespository supplierRespository;
    private final EventBus eventBus;

    public CreateSupplierService(SupplierRespository supplierRespository, EventBus eventBus) {
        this.supplierRespository = supplierRespository;
        this.eventBus = eventBus;
    }

    @Override
    @Transactional
    public void exec(CreateSupplierCommand command) {
        if(supplierRespository.isNameUsedOnBusiness(command.companyName(), command.businessId()))
            throw new RuntimeException("Supplier company name already on use inside business");

        Supplier supplier = new Supplier(
                command.supplierId(),
                command.businessId(),
                command.companyName()
        );

        supplierRespository.save(supplier);
        eventBus.publish(List.of(
                new SupplierCreatedDomainEvent(supplier)
        ));
    }
}
