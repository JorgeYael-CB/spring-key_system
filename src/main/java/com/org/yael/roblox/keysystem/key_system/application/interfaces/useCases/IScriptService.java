package com.org.yael.roblox.keysystem.key_system.application.interfaces.useCases;

import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.CreateScriptDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.ScriptDto;
import com.org.yael.roblox.keysystem.key_system.application.services.ResponseService;




public interface IScriptService {
    public ResponseService<ScriptDto> Create(CreateScriptDto scriptDto);
    public ResponseService<ScriptDto> Delete( String scriptId );
}
