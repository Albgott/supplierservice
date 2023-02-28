package com.albgott.supplierservice.supplier.domain.model;

import com.albgott.supplierservice.shared.domain.model.AggregateRoot;

import java.util.UUID;

public class Supplier extends AggregateRoot {
    private UUID businessId;
    private UUID id;
    private NIF nif;
    private CompanyName companyName;
    private PostalCode postalCode;
    private Direction direction;
    private Municipality municipality;
    private Country country;
    private City city;
    private ContactDetails contact;
}
