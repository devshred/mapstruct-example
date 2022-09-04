package org.devshred.mapstruct.customer;

import java.util.UUID;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(imports = UUID.class)
public interface CustomerMapper {
    @Mapping(source = "customerId", target = "id")
    CustomerDto entityToDto(CustomerEntity entity);

    @Mapping(source = "id", target = "customerId", defaultExpression = "java(UUID.randomUUID())")
    @Mapping(target = "id", ignore = true)
    CustomerEntity dtoToEntity(CustomerDto dto);
}
