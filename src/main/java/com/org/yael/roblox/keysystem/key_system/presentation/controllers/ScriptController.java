package com.org.yael.roblox.keysystem.key_system.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.CreateScriptDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.ScriptDto;
import com.org.yael.roblox.keysystem.key_system.application.interfaces.useCases.IScriptService;
import com.org.yael.roblox.keysystem.key_system.application.services.ResponseService;




@RestController
@RequestMapping("/api/scripts")
public class ScriptController {

    @Autowired
    IScriptService scriptService;


    @PostMapping("/{urlScript}/{userId}")
    public ResponseEntity<ResponseService<ScriptDto>> CreateScript( @RequestBody CreateScriptDto scriptDto ){
        return ResponseEntity.status(HttpStatus.CREATED).body(scriptService.Create(scriptDto));
    }

}
