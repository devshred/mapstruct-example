package org.devshred.mapstruct.happypath;

import static org.assertj.core.api.Assertions.assertThat;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;


class HappyPathMapperEasyRandomTest {
    private static final EasyRandom GENERATOR = new EasyRandom();
    private static final HappyPathMapper MAPPER = Mappers.getMapper(HappyPathMapper.class);

    @Test
    void entityToDto() {
        final HappyPathEntity entity = GENERATOR.nextObject(HappyPathEntity.class);
        final HappyPathDto dto = MAPPER.entityToDto(entity);

        assertThat(dto) //
                .usingRecursiveComparison() //
                .isEqualTo(entity);
    }

    @Test
    void dtoToEntity() {
        final HappyPathDto dto = GENERATOR.nextObject(HappyPathDto.class);
        final HappyPathEntity entity = MAPPER.dtoToEntity(dto);

        assertThat(entity) //
                .usingRecursiveComparison() //
                .isEqualTo(dto);
    }
}
