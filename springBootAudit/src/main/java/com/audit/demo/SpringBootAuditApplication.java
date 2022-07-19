package com.audit.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableWebSecurity
public class SpringBootAuditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAuditApplication.class, args);
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
