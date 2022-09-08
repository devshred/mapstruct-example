package org.devshred.mapstruct.happypath;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class HappyPathDto {
    long id;
    String field1;
    String field2;
    String field3;
    BigDecimal price;
    HappyState state;
    HappyChild child;
}
