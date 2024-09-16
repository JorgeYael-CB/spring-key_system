package com.org.yael.roblox.keysystem.key_system.application.services.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.CreateUserDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.UserDto;
import com.org.yael.roblox.keysystem.key_system.application.interfaces.auth.IAuthRepository;
import com.org.yael.roblox.keysystem.key_system.application.interfaces.auth.IAuthService;
import com.org.yael.roblox.keysystem.key_system.application.services.ResponseService;



@Service
public class AuthServiceImpl implements IAuthService {

    @Autowired
    IAuthRepository authRepository;


    @Override
    public ResponseService<UserDto> CreateKey(CreateUserDto userDto) {
        UserDto user = authRepository.CreateUser(userDto);

        //TODO: llamar al servicio del token
        String token = "Token";

        ResponseService<UserDto> response = new ResponseService<>();
        response.setMessage("Succes!");
        response.setStatus(201);
        response.setToken(token);
        response.seData(user);

        return response;
    }

    @Override
    public ResponseService<UserDto> DeleteUser(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'DeleteUser'");
    }

    @Override
    public ResponseService<UserDto> ValidateKey(String key) {
        throw new UnsupportedOperationException("Unimplemented method 'ValidateKey'");
    }

}
