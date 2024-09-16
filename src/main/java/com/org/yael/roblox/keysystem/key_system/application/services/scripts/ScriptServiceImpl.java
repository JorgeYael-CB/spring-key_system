package com.org.yael.roblox.keysystem.key_system.application.services.scripts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.CreateScriptDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.ScriptDto;
import com.org.yael.roblox.keysystem.key_system.application.interfaces.repositories.IScriptRepository;
import com.org.yael.roblox.keysystem.key_system.application.interfaces.useCases.IScriptService;
import com.org.yael.roblox.keysystem.key_system.application.services.ResponseService;



@Service
public class ScriptServiceImpl implements IScriptService {

    @Autowired
    IScriptRepository scriptRepository;


    @Override
    public ResponseService<ScriptDto> Create(CreateScriptDto createScriptDto) {
        ScriptDto newScript = scriptRepository.CreateScript(createScriptDto);

        final String token = "Hello World!";

        ResponseService<ScriptDto> response = new ResponseService<>();
        response.setMessage("Already created new script");
        response.setStatus(201);
        response.setToken(token);
        response.seData(newScript);

        return response;
    }

    @Override
    public ResponseService<ScriptDto> Delete(String scriptId) {
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }

}
