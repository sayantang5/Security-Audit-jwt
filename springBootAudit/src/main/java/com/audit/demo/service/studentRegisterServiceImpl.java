package com.audit.demo.service;

import java.util.ArrayList;
import java.util.UUID;

import com.audit.demo.dto.studentLoginDTO;
import com.audit.demo.entity.Studentlogin;
import com.audit.demo.repository.StudentLoginRepo;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class studentRegisterServiceImpl implements studentRegisterService  {

	@Autowired
	ModelMapper modelmapper;
	
	@Autowired
	StudentLoginRepo repo;
	
	
	@Autowired(required=true)
	private PasswordEncoder passwordencoder;
	
	
	
	@Override
	public studentLoginDTO Studentregistration(studentLoginDTO loginDTO) {
		
		//loginDTO.setUserId(UUID.randomUUID().toString());

		Studentlogin studentlogin = modelmapper.map(loginDTO, Studentlogin.class);
		
		modelmapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		studentlogin.setUserId(UUID.randomUUID().toString());
		studentlogin.setEncriptedPassword(passwordencoder.encode(loginDTO.getPassword() ));
		
		 
		Studentlogin savedStudent = repo.save(studentlogin);
		
		studentLoginDTO DTOmap = modelmapper.map(savedStudent, studentLoginDTO.class);
		
		
		
		
		return DTOmap;
	}

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Studentlogin studentidentity = repo.findByemail(username);
		
		return new User(studentidentity.getEmail(), studentidentity.getEncriptedPassword(), new ArrayList<>());
		
		
		
	}

}
