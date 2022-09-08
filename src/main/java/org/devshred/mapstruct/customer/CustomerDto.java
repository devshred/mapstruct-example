package org.devshred.mapstruct.customer;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CustomerDto {
    UUID id;
    String status;
    String name;
    String city;
    String validFrom;
}
