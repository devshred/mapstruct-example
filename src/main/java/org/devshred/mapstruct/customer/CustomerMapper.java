package org.devshred.mapstruct.customer;

import java.util.UUID;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(imports = UUID.class)
public interface CustomerMapper {
    @Mapping(source = "customerId", target = "id")
    @Mapping(source = "contract.type", target = "contractType")
    // @Mapping(target = "startDate", dateFormat = "dd.MM.yyyy")
    // @InheritInverseConfiguration
    CustomerDto entityToDto(CustomerEntity entity);

    @Mapping(target = "customerId", source = "id", defaultExpression = "java(UUID.randomUUID())")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "contract.type", source = "contractType")
    CustomerEntity dtoToEntity(CustomerDto dto);

    AddressDto entityToDto(AddressEntity entity);

    AddressEntity dtoToEntity(AddressDto dto);
}
