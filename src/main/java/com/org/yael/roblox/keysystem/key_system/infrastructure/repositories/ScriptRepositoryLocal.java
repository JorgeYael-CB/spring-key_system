package com.org.yael.roblox.keysystem.key_system.infrastructure.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.CreateScriptDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.ScriptDto;
import com.org.yael.roblox.keysystem.key_system.application.interfaces.repositories.IScriptRepository;
import com.org.yael.roblox.keysystem.key_system.application.mappers.ScriptMapper;
import com.org.yael.roblox.keysystem.key_system.domain.entities.scripts.ScriptEntity;
import com.org.yael.roblox.keysystem.key_system.domain.exceptions.CustomException;




@Repository
public class ScriptRepositoryLocal implements IScriptRepository {

    @Autowired
    ScriptMapper mapper;

    final List<ScriptEntity> scripts = new ArrayList<>();


    @Override
    public ScriptDto CreateScript(CreateScriptDto createScriptDto) {
        Optional<ScriptEntity> scriptDb = scripts.stream().filter( s -> s.getScript().equals(createScriptDto.scriptUrl) )
            .findFirst();

        if( scriptDb.isPresent() ) throw CustomException.BadRequestException("Script already exists");

        ScriptEntity newScript = new ScriptEntity();
        newScript.setScript(createScriptDto.scriptUrl);
        newScript.setId( String.valueOf(scripts.toArray().length + 1) );

        scripts.add(newScript);

        return mapper.toScriptDto(newScript);
    }

    @Override
    public ScriptDto DeleteScript(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'DeleteScript'");
    }

}
