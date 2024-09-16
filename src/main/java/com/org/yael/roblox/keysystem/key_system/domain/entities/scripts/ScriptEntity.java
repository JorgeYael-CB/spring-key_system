package com.org.yael.roblox.keysystem.key_system.domain.entities.scripts;

import java.util.ArrayList;
import java.util.List;

import com.org.yael.roblox.keysystem.key_system.domain.entities.Entity;
import com.org.yael.roblox.keysystem.key_system.domain.entities.user.UserEntity;





public class ScriptEntity extends Entity {
    private int countLinks = 0;
    private List<UserEntity> users = new ArrayList<>();
    private UserEntity owner;
    private int clicksCounterByMonth = 0;
    private int countClicks = 0;
    private String script;


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

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public UserEntity getOwner() {
        return owner;
    }

    public void setOwner(UserEntity owner) {
        this.owner = owner;
    }

}
