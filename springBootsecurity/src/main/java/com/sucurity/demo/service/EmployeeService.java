package com.sucurity.demo.service;

import java.util.List;

import com.sucurity.demo.dto.EmployeeResponseDto;
import com.sucurity.demo.dto.Employeedto;
import com.sucurity.demo.entity.Employee;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface EmployeeService  extends UserDetailsService{
	public List<EmployeeResponseDto> getAllEmployee();
	public EmployeeResponseDto SaveEmployee(Employeedto employeedto);
	public Employee getUser(String username);

}
