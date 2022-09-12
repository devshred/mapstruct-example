package org.devshred.mapstruct.customer;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "customerId", source = "id", defaultExpression = "java(java.util.UUID.randomUUID())")
    @Mapping(target = "contract.type", source = "contractType", defaultValue = "BUSINESS")
    CustomerEntity dtoToEntity(CustomerDto dto);

    @InheritInverseConfiguration
    CustomerDto entityToDto(CustomerEntity entity);
}
