package com.org.yael.roblox.keysystem.key_system.application.dtos.auth;

import java.util.Date;
import java.util.List;



public class UserDto {
    private String name;
    private String id;
    private int robloxId;
    private Date updatedAt;
    private Date createdAt;
    private List<String> roles;
    private boolean isActive;
    private Date lastConnection;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getRobloxId() {
        return robloxId;
    }
    public void setRobloxId(int robloxId) {
        this.robloxId = robloxId;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getLastConnection() {
        return lastConnection;
    }
    public void setLastConnection(Date lastConnection) {
        this.lastConnection = lastConnection;
    }

}
