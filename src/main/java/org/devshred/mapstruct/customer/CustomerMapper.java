package org.devshred.mapstruct.customer;

import java.util.UUID;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(imports = UUID.class)
public interface CustomerMapper {
    @Mapping(source = "customerId", target = "id")
    @Mapping(source = "address.city", target = "city")
    // @Mapping(target = "startDate", dateFormat = "dd.MM.yyyy")
    // @InheritInverseConfiguration
    CustomerDto entityToDto(CustomerEntity entity);

    @Mapping(target = "customerId", source = "id", defaultExpression = "java(UUID.randomUUID())")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address.city", source = "city")
    CustomerEntity dtoToEntity(CustomerDto dto);
}
