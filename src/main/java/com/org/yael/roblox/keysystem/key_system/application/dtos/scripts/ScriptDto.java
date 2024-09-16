package com.org.yael.roblox.keysystem.key_system.application.dtos.scripts;

import java.util.Date;
import java.util.List;

import com.org.yael.roblox.keysystem.key_system.domain.entities.user.UserEntity;



public class ScriptDto {
    private int countLinks;
    private List<UserEntity> users;
    private UserEntity owner;
    private int clicksCounterByMonth;
    private int countClicks;
    private String id;
    private Date createdAt;
    private Date updatedAt;
    private boolean isAvailable;


    public int getCountLinks() {
        return countLinks;
    }
    public void setCountLinks(int countLinks) {
        this.countLinks = countLinks;
    }
    public List<UserEntity> getUsers() {
        return users;
    }
    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }
    public int getClicksCounterByMonth() {
        return clicksCounterByMonth;
    }
    public void setClicksCounterByMonth(int clicksCounterByMonth) {
        this.clicksCounterByMonth = clicksCounterByMonth;
    }
    public int getCountClicks() {
        return countClicks;
    }
    public void setCountClicks(int countClicks) {
        this.countClicks = countClicks;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public UserEntity getOwner() {
        return owner;
    }

    public void setOwner(UserEntity owner) {
        this.owner = owner;
    }


    
}
