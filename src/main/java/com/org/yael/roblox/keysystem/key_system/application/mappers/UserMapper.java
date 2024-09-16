package com.org.yael.roblox.keysystem.key_system.application.mappers;

import org.mapstruct.Mapper;

import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.UserDto;
import com.org.yael.roblox.keysystem.key_system.domain.entities.user.UserEntity;



@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toUserDto(UserEntity user);
}
