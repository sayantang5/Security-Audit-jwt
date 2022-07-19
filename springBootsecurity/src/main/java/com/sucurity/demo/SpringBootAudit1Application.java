package com.sucurity.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableWebSecurity(debug=true)
public class SpringBootAudit1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAudit1Application.class, args);
	}
	
	
	@Bean
	ModelMapper modelmapper() {
		
		
		return new ModelMapper();
	}
	
	
	@Bean
	public PasswordEncoder passwordencoder() {
		
		return new  BCryptPasswordEncoder();
	}

}
