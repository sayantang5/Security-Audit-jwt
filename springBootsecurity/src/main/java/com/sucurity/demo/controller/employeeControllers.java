package com.sucurity.demo.controller;

import java.util.List;

import com.sucurity.demo.dto.EmployeeResponseDto;
import com.sucurity.demo.dto.Employeedto;
import com.sucurity.demo.service.EmployeeServiceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeControllers {

	@Autowired
	EmployeeServiceimpl service;

	
	
	@PostMapping("/register")
	public ResponseEntity<EmployeeResponseDto> Register(@RequestBody Employeedto employeedto) {

		EmployeeResponseDto saveEmployee = service.SaveEmployee(employeedto);

		return ResponseEntity.status(HttpStatus.CREATED).body(saveEmployee);

	}
	
	@GetMapping("/findall")
	public List<EmployeeResponseDto> getAllEmployee(){
		
		
		List<EmployeeResponseDto> allEmployee = service.getAllEmployee();
		
		return allEmployee;
		
		
		
	}
	
	@GetMapping("/test")
	public String testing(){
		
		
		
		
		return "testing";
		
		
		
	}

}
