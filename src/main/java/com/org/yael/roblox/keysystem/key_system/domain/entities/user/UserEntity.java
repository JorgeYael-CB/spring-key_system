package com.org.yael.roblox.keysystem.key_system.domain.entities.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.org.yael.roblox.keysystem.key_system.domain.entities.Entity;
import com.org.yael.roblox.keysystem.key_system.domain.entities.scripts.ScriptEntity;



public class UserEntity extends Entity {
    private String name;
    private Optional<String> email;
    private int robloxId;
    private List<String> roles = new ArrayList<>(Arrays.asList("USER"));
    private Date lastConnection = new Date();
    private List<ScriptEntity> myScripts = new ArrayList<>();
    private List<ScriptEntity> scriptsUsed = new ArrayList<>();



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Optional<String> getEmail() {
        return email;
    }
    public void setEmail(Optional<String> email) {
        this.email = email;
    }
    public int getRobloxId() {
        return robloxId;
    }
    public void setRobloxId(int robloxId) {
        this.robloxId = robloxId;
    }
    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
    public Date getLastConnection() {
        return lastConnection;
    }
    public void setLastConnection(Date lastConnection) {
        this.lastConnection = lastConnection;
    }

    public List<ScriptEntity> getScripts() {
        return myScripts;
    }

    public void setScripts(List<ScriptEntity> myScript) {
        this.myScripts = myScript;
    }

    public List<ScriptEntity> getScriptsUsed() {
        return scriptsUsed;
    }

    public void setScriptsUsed(List<ScriptEntity> scriptsUsed) {
        this.scriptsUsed = scriptsUsed;
    }

}
