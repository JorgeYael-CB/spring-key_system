package com.org.yael.roblox.keysystem.key_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;



@SpringBootApplication
@PropertySource("classpath:db.properties") // conexion a la base de datos
public class KeySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeySystemApplication.class, args);
	}

}
