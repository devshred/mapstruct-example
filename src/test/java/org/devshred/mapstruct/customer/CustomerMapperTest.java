package org.devshred.mapstruct.customer;


import static org.assertj.core.api.Assertions.assertThat;
import static org.devshred.mapstruct.customer.CustomerEntity.createCustomerEntity;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class CustomerMapperTest {
    private final CustomerMapper mapper = Mappers.getMapper(CustomerMapper.class);

    @Test
    void entityToDto() {
        final CustomerDto customerDto = mapper.entityToDto(createCustomerEntity("Peter", "Berlin"));

        assertThat(customerDto) //
                .isNotNull() //
                .extracting("name", "address.city").containsExactly("Peter", "Berlin");
    }

    @Test
    void dtoToEntity() {
        final CustomerDto dto = CustomerDto.builder() //
                .id(UUID.randomUUID()) //
                .name("Peter") //
                .address(new AddressDto("Berlin", "Parkstrasse")) //
                .build();
        final CustomerEntity entity = mapper.dtoToEntity(dto);

        assertThat(entity) //
                .isNotNull() //
                .extracting("name", "address.city").containsExactly("Peter", "Berlin");

        assertThat(entity.getCustomerId()).isEqualTo(dto.getId());
    }

    @Test
    void createCustomerIdIfEmpty() {
        final CustomerDto dto =
                CustomerDto.builder().name("Peter").address(new AddressDto("Berlin", "Parkstrasse")).build();
        final CustomerEntity entity = mapper.dtoToEntity(dto);

        assertThat(entity.getCustomerId()).isNotNull();
    }
}
