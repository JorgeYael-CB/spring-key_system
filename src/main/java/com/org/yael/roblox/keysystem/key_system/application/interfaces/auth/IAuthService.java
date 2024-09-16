package com.org.yael.roblox.keysystem.key_system.application.interfaces.auth;

import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.CreateUserDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.UserDto;
import com.org.yael.roblox.keysystem.key_system.application.services.ResponseService;




public interface IAuthService {
    public ResponseService<UserDto> CreateKey( CreateUserDto userDto );
    public ResponseService<UserDto> DeleteUser( String id );
    public ResponseService<UserDto> ValidateKey( String key );
}
