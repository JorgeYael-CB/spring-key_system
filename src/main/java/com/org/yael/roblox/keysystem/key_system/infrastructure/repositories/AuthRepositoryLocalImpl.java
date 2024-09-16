package com.org.yael.roblox.keysystem.key_system.infrastructure.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.CreateUserDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.UserDto;
import com.org.yael.roblox.keysystem.key_system.application.interfaces.auth.IAuthRepository;
import com.org.yael.roblox.keysystem.key_system.application.mappers.UserMapper;
import com.org.yael.roblox.keysystem.key_system.domain.entities.user.UserEntity;
import com.org.yael.roblox.keysystem.key_system.domain.exceptions.CustomException;



@Repository
public class AuthRepositoryLocalImpl implements IAuthRepository {

    @Autowired
    UserMapper userMapper;

    final List<UserEntity> Users = new ArrayList<>();


    @Override
    public UserDto CreateUser(CreateUserDto userDto) {
        Optional<UserEntity> user = Users.stream().filter( u -> u.getRobloxId() == userDto.getRobloxId() )
            .findFirst();
        if( user.isPresent() ) throw CustomException.BadRequestException("User already exists");

        UserEntity newUser = new UserEntity();
        newUser.setName(userDto.getName());
        newUser.setId( String.valueOf((Users.stream().count()) + 1) );
        newUser.setRobloxId(userDto.getRobloxId());

        Users.add(newUser);

        return userMapper.toUserDto(newUser);
    }


    @Override
    public UserDto GetUserById(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'GetUserById'");
    }

}
