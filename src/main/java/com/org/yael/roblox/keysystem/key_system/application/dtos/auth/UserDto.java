package com.org.yael.roblox.keysystem.key_system.application.dtos.auth;

import java.util.Date;
import java.util.List;



public class UserDto {
    public String name;
    public String id;
    public int robloxId;
    public Date updatedAt;
    public Date createdAt;
    public List<String> roles;
    public boolean isActive;
    public Date lastConnection;
}
