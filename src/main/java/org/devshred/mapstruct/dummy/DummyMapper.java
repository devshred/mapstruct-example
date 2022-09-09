package org.devshred.mapstruct.dummy;

public final class DummyMapper {
    private DummyMapper() {}

    public static DummyDto entityToDto(DummyEntity entity) {
        if (entity == null) {
            return null;
        }

        final DummyDto dummyDto = new DummyDto();

        dummyDto.setField01(entity.getField01());
        dummyDto.setField02(entity.getField02());
        dummyDto.setField03(entity.getField03());
        dummyDto.setField04(entity.getField04());
        dummyDto.setField05(entity.getField05());
        dummyDto.setField06(entity.getField06());
        dummyDto.setField07(entity.getField07());
        dummyDto.setField08(entity.getField08());
        dummyDto.setField09(entity.getField09());
        dummyDto.setField10(entity.getField10());
        dummyDto.setField11(entity.getField11());
        dummyDto.setField12(entity.getField12());
        dummyDto.setField13(entity.getField13());
        dummyDto.setField14(entity.getField14());
        dummyDto.setField15(entity.getField15());
        dummyDto.setField16(entity.getField16());
        dummyDto.setField17(entity.getField17());
        dummyDto.setField18(entity.getField18());
        dummyDto.setField19(entity.getField19());
        dummyDto.setField20(entity.getField20());

        return dummyDto;
    }

    public static DummyEntity dtoToEntity(DummyDto dto) {
        if (dto == null) {
            return null;
        }

        final DummyEntity dummyEntity = new DummyEntity();

        dummyEntity.setField01(dto.getField01());
        dummyEntity.setField02(dto.getField02());
        dummyEntity.setField03(dto.getField03());
        dummyEntity.setField04(dto.getField04());
        dummyEntity.setField05(dto.getField05());
        dummyEntity.setField06(dto.getField06());
        dummyEntity.setField07(dto.getField07());
        dummyEntity.setField08(dto.getField08());
        dummyEntity.setField09(dto.getField09());
        dummyEntity.setField10(dto.getField10());
        dummyEntity.setField11(dto.getField11());
        dummyEntity.setField12(dto.getField12());
        dummyEntity.setField13(dto.getField13());
        dummyEntity.setField14(dto.getField14());
        dummyEntity.setField15(dto.getField15());
        dummyEntity.setField16(dto.getField16());
        dummyEntity.setField17(dto.getField17());
        dummyEntity.setField18(dto.getField18());
        dummyEntity.setField19(dto.getField19());
        dummyEntity.setField20(dto.getField20());

        return dummyEntity;
    }
}
