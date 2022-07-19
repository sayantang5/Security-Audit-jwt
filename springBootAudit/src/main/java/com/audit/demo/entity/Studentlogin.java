package com.audit.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Studentlogin  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int  id;
	@Column(name="studentFirstName")
	private String firstName;
	@Column(name="studentLastName")
	private String lastName;
	@Column(name="studentUserId")
	private String userId;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String encriptedPassword;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEncriptedPassword() {
		return encriptedPassword;
	}
	public void setEncriptedPassword(String encriptedPassword) {
		this.encriptedPassword = encriptedPassword;
	}
	@Override
	public String toString() {
		return "Studentlogin [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userId=" + userId
				+ ", email=" + email + ", encriptedPassword=" + encriptedPassword + "]";
	}
	
	
	

}
