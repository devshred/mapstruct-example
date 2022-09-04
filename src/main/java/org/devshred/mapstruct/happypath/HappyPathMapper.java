package org.devshred.mapstruct.happypath;

import org.mapstruct.Mapper;

@Mapper
public interface HappyPathMapper {
    HappyPathDto entityToDto(HappyPathEntity entity);

    HappyPathEntity dtoToEntity(HappyPathDto dto);
}
