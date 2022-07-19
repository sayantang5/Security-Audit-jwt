package com.sucurity.demo.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sucurity.demo.entity.Employee;

public class AuthorizationDTO {
	
	
	
	

	private int id;
	
	private String role;

	
	private Employee employee;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "AuthorizationDTO [id=" + id + ", role=" + role + ", employee=" + employee + "]";
	}
	
	
	


}
