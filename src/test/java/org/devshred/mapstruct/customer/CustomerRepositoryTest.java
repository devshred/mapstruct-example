package org.devshred.mapstruct.customer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.devshred.mapstruct.customer.CustomerEntity.createCustomerEntity;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class CustomerRepositoryTest {
    @Autowired
    CustomerRepository repository;

    @Test
    void persistAndRetrieve() {
        final CustomerEntity entity = createCustomerEntity("Peter", "Berlin");

        final CustomerEntity saved = repository.save(entity);
        assertThat(saved).isNotNull();

        Optional<CustomerEntity> found = repository.findById(saved.getId());
        assertThat(found) //
                .isPresent().get() //
                .extracting("name", "address.city") //
                .containsExactly("Peter", "Berlin");
    }

    @Test
    void findByCustomerId() {
        final CustomerEntity entity = createCustomerEntity("Peter", "Berlin");
        repository.save(entity);

        Optional<CustomerEntity> result = repository.findByCustomerId(entity.getCustomerId());
        assertThat(result).isPresent();
    }
}
