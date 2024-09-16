package com.org.yael.roblox.keysystem.key_system.application.mappers;

import org.mapstruct.Mapper;

import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.ScriptDto;
import com.org.yael.roblox.keysystem.key_system.domain.entities.scripts.ScriptEntity;



@Mapper(componentModel = "spring")
public interface ScriptMapper {
    ScriptDto toScriptDto( ScriptEntity scriptEntity );
}
