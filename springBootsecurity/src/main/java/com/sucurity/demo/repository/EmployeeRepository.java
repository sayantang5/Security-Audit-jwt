package com.sucurity.demo.repository;

import com.sucurity.demo.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	
	public Employee findByemail( String email);

}
