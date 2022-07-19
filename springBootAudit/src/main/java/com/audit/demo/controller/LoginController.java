package com.audit.demo.controller;

import com.audit.demo.dto.studentLoginDTO;
import com.audit.demo.model.studentLogInRequestModel;
import com.audit.demo.model.studentLogInResponseModel;
import com.audit.demo.service.studentRegisterService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	
	@Autowired
	ModelMapper modelmapper;
	
	@Autowired
	studentRegisterService setudentserv;
	
	
	@PostMapping("/register")
	public ResponseEntity<studentLogInResponseModel> DoRegister(@RequestBody studentLogInRequestModel requestmodel)
	{
		
		studentLoginDTO DTOmap = modelmapper.map(requestmodel,studentLoginDTO.class );
		
		studentLoginDTO studentregistration = setudentserv.Studentregistration(DTOmap);
		
		studentLogInResponseModel responsemap = modelmapper.map(studentregistration,studentLogInResponseModel.class);
		
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(responsemap);
	}
	
	
	@GetMapping("/test")
	public String testing()
	{
		
		return "testing";
		
	}

}
