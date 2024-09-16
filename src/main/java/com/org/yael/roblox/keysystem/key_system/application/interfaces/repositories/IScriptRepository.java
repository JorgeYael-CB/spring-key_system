package com.org.yael.roblox.keysystem.key_system.application.interfaces.repositories;

import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.CreateScriptDto;
import com.org.yael.roblox.keysystem.key_system.application.dtos.scripts.ScriptDto;




public interface IScriptRepository {
    public ScriptDto CreateScript( CreateScriptDto scriptDto );
    public ScriptDto DeleteScript( int id );
}
