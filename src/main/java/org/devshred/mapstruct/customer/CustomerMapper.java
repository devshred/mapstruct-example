package org.devshred.mapstruct.customer;

import java.util.UUID;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(imports = UUID.class)
public interface CustomerMapper {
    @Mapping(source = "customerId", target = "id")
//    @Mapping(target = "validFrom", dateFormat = "dd.MM.yyyy")
    @Mapping(source = "address.city", target = "city")
    CustomerDto entityToDto(CustomerEntity entity);

    @Mapping(source = "id", target = "customerId", defaultExpression = "java(UUID.randomUUID())")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address.city", source = "city")
    CustomerEntity dtoToEntity(CustomerDto dto);
}
