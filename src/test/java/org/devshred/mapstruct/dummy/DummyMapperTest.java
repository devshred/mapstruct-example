package org.devshred.mapstruct.dummy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DummyMapperTest {
    @Test
    void dtoToEntity() {
        DummyDto dto = new DummyDto("field01", "field02", "field03", "field04", "field05", "field06", "field07",
                "field08", "field09", "field10", "field11", "field12", "field13", "field14", "field15", "field16",
                "field17", "field18", "field19", "field20");

        DummyEntity entity = DummyMapper.dtoToEntity(dto);

        assertThat(entity.getField01()).isEqualTo(dto.getField01());
        assertThat(entity.getField02()).isEqualTo(dto.getField02());
        assertThat(entity.getField03()).isEqualTo(dto.getField03());
        assertThat(entity.getField04()).isEqualTo(dto.getField04());
        assertThat(entity.getField05()).isEqualTo(dto.getField05());
        assertThat(entity.getField06()).isEqualTo(dto.getField06());
        assertThat(entity.getField07()).isEqualTo(dto.getField07());
        assertThat(entity.getField08()).isEqualTo(dto.getField08());
        assertThat(entity.getField09()).isEqualTo(dto.getField09());
        assertThat(entity.getField10()).isEqualTo(dto.getField10());
        assertThat(entity.getField11()).isEqualTo(dto.getField11());
        assertThat(entity.getField12()).isEqualTo(dto.getField12());
        assertThat(entity.getField13()).isEqualTo(dto.getField13());
        assertThat(entity.getField14()).isEqualTo(dto.getField14());
        assertThat(entity.getField15()).isEqualTo(dto.getField15());
        assertThat(entity.getField16()).isEqualTo(dto.getField16());
        assertThat(entity.getField17()).isEqualTo(dto.getField17());
        assertThat(entity.getField18()).isEqualTo(dto.getField18());
        assertThat(entity.getField19()).isEqualTo(dto.getField19());
        assertThat(entity.getField20()).isEqualTo(dto.getField20());
    }

    @Test
    void entityToDto() {
        DummyEntity entity = new DummyEntity(1L, "field01", "field02", "field03", "field04", "field05", "field06",
                "field07", "field08", "field09", "field10", "field11", "field12", "field13", "field14", "field15",
                "field16", "field17", "field18", "field19", "field20");

        DummyDto dto = DummyMapper.entityToDto(entity);

        assertThat(dto.getField01()).isEqualTo(entity.getField01());
        assertThat(dto.getField02()).isEqualTo(entity.getField02());
        assertThat(dto.getField03()).isEqualTo(entity.getField03());
        assertThat(dto.getField04()).isEqualTo(entity.getField04());
        assertThat(dto.getField05()).isEqualTo(entity.getField05());
        assertThat(dto.getField06()).isEqualTo(entity.getField06());
        assertThat(dto.getField07()).isEqualTo(entity.getField07());
        assertThat(dto.getField08()).isEqualTo(entity.getField08());
        assertThat(dto.getField09()).isEqualTo(entity.getField09());
        assertThat(dto.getField10()).isEqualTo(entity.getField10());
        assertThat(dto.getField11()).isEqualTo(entity.getField11());
        assertThat(dto.getField12()).isEqualTo(entity.getField12());
        assertThat(dto.getField13()).isEqualTo(entity.getField13());
        assertThat(dto.getField14()).isEqualTo(entity.getField14());
        assertThat(dto.getField15()).isEqualTo(entity.getField15());
        assertThat(dto.getField16()).isEqualTo(entity.getField16());
        assertThat(dto.getField17()).isEqualTo(entity.getField17());
        assertThat(dto.getField18()).isEqualTo(entity.getField18());
        assertThat(dto.getField19()).isEqualTo(entity.getField19());
        assertThat(dto.getField20()).isEqualTo(entity.getField20());
    }
}