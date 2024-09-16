package com.org.yael.roblox.keysystem.key_system.application.interfaces.auth;

import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.CreateUserDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.UserDto;



public interface IAuthRepository {
    public UserDto CreateUser( CreateUserDto userDto );
    public UserDto GetUserById( String id );
}
