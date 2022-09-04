package org.devshred.mapstruct.customer;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.ok;

import java.net.URI;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerRepository db;
    private final CustomerMapper mapper;

    public CustomerController(CustomerRepository repository, CustomerMapper mapper) {
        this.db = repository;
        this.mapper = mapper;
    }

    @GetMapping(value = "/", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<CustomerEntity> findAll() {
        return db.findAll();
    }

    @GetMapping(value = "/{customerId}", produces = "application/json")
    public ResponseEntity<CustomerDto> findByCustomerId(@PathVariable UUID customerId) {
        return db.findByCustomerId(customerId) //
                .map(c -> ok().body(mapper.entityToDto(c))) //
                .orElseThrow(ResourceNotFoundException::new);
    }

    @PostMapping
    public ResponseEntity<URI> save(@RequestBody CustomerDto customerDto) {
        final CustomerEntity savedCustomerEntity = db.save(mapper.dtoToEntity(customerDto));
        return created(URI.create(String.format("/customer/%s", savedCustomerEntity.getCustomerId().toString())))
                .build();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class ResourceNotFoundException extends RuntimeException {}
}
