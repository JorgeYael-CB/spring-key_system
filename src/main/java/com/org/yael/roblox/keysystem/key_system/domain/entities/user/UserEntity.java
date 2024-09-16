package com.org.yael.roblox.keysystem.key_system.domain.entities.user;

import java.util.Date;
import java.util.List;
import java.util.Optional;



public class UserEntity {
    private String name;
    private Optional<String> email;
    private String id;
    private int robloxId;
    private Date updatedAt = new Date();
    private Date createdAt = new Date();
    private List<String> roles;
    private boolean isActive = true;
    private Date lastConnection = new Date();



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
