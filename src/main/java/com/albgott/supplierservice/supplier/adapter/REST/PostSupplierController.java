package com.albgott.supplierservice.supplier.adapter.REST;

import com.albgott.supplierservice.supplier.application.create.CreateSupplierCommand;
import com.albgott.supplierservice.supplier.application.create.CreateSupplierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PostSupplierController {

    private final CreateSupplierService service;

    public PostSupplierController(CreateSupplierService service) {
        this.service = service;
    }

    @PostMapping("/suppliers")
    public ResponseEntity<String> doPOst(@RequestBody Body body){
        service.exec(new CreateSupplierCommand(
                UUID.fromString(body.business_id),
                UUID.fromString(body.supplier_id),
                body.company_name
        ));
        return ResponseEntity.ok().build();
    }

    private record Body(String business_id, String supplier_id, String company_name){}
}
