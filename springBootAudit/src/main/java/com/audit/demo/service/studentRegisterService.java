package com.audit.demo.service;

import com.audit.demo.dto.studentLoginDTO;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface studentRegisterService  extends UserDetailsService{
	
	
	public studentLoginDTO Studentregistration(studentLoginDTO loginDTO);

}
