package com.org.yael.roblox.keysystem.key_system.application.dtos.auth;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;




@Component
public class CreateUserDto {

    @NotEmpty(message="Missing name")
    private String name;

    @Min(value=1)
    private Integer robloxId;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRobloxId() {
        return robloxId;
    }

    public void setRobloxId(Integer robloxId) {
        this.robloxId = robloxId;
    }

}
