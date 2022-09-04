package org.devshred.mapstruct.happypath;

import static org.assertj.core.api.Assertions.assertThat;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;


class HappyPathMapperEasyRandomTest {
    private static final EasyRandom GENERATOR = new EasyRandom();
    private final HappyPathMapper mapper = Mappers.getMapper(HappyPathMapper.class);

    @Test
    void entityToDto() {
        final HappyPathEntity entity = GENERATOR.nextObject(HappyPathEntity.class);
        final HappyPathDto dto = mapper.entityToDto(entity);

        assertThat(dto) //
                .usingRecursiveComparison() //
                .isEqualTo(entity);
    }
}