package org.devshred.mapstruct.happypath;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;


class HappyPathMapperTest {
    private final HappyPathMapper mapper = Mappers.getMapper(HappyPathMapper.class);

    @Test
    void entityToDto() {
        final HappyPathEntity entity = HappyPathEntity.builder() //
                .id(1L)
                .field1("eins") //
                .field2("zwei") //
                .field3("drei") //
                .price(BigDecimal.TEN) //
                .state(HappyState.GREAT) //
                .child(HappyChild.builder().name("Peter").build()) //
                .build();
        final HappyPathDto dto = mapper.entityToDto(entity);

        assertThat(dto) //
                .usingRecursiveComparison() //
                .isEqualTo(entity);
    }

    @Test
    void dtoToEntity() {
        final HappyPathDto dto = new HappyPathDto( //
                1L, //
                "eins", //
                "zwei", //
                "drei", //
                BigDecimal.TEN, //
                HappyState.GREAT, //
                HappyChild.builder().name("Peter").build() //
        );
        final HappyPathEntity entity = mapper.dtoToEntity(dto);

        assertThat(dto) //
                .usingRecursiveComparison() //
                .isEqualTo(entity);
    }
}