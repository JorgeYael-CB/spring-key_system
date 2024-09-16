package com.org.yael.roblox.keysystem.key_system.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.CreateUserDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.auth.UserDto;
import com.org.yael.roblox.keysystem.key_system.application.interfaces.auth.IAuthService;
import com.org.yael.roblox.keysystem.key_system.application.services.ResponseService;




@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    IAuthService authService;

    @PostMapping
    public ResponseEntity<ResponseService<UserDto>> GetKey( @RequestBody CreateUserDto userDto ){
        return ResponseEntity.ok().body(authService.CreateKey(userDto));
    }

    @GetMapping("/{token}")
    public ResponseEntity<ResponseService<UserDto>> VerifyKey( String token ){
        return ResponseEntity.ok().body(authService.ValidateKey(token));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseService<UserDto>> DeleteAccount( String id ){
        return  ResponseEntity.ok().body(authService.DeleteUser(id));
    }

}
