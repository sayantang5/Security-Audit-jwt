package com.audit.demo.model;

public class studentLogInResponseModel {


	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	
	
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
	@Override
	public String toString() {
		return "studentLogInResponseModel [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", userId=" + userId + "]";
	}
	
	
	
	
	
	 
}
