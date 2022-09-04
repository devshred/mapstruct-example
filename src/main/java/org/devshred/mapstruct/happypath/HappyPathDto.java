package org.devshred.mapstruct.happypath;

import java.math.BigDecimal;

public record HappyPathDto( //
        Long id, //
        String field1, //
        String field2, //
        String field3, //
        BigDecimal price, //
        HappyState state, //
        HappyChild child) {
}
