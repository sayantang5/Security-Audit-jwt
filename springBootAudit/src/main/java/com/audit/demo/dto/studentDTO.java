package com.audit.demo.dto;

public class studentDTO {
	
	
	private int studentId;
	private String studentName;
	private String Course;
	private int Exprience;
	
	
	
	public studentDTO() {
		
	}
	
	


	public studentDTO(String studentName, String course, int exprience) {
		super();
		this.studentName = studentName;
		Course = course;
		Exprience = exprience;
	}
	
	
	

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getExprience() {
		return Exprience;
	}
	public void setExprience(int exprience) {
		Exprience = exprience;
	}
	@Override
	public String toString() {
		return "studentDTO [studentName=" + studentName + ", Course=" + Course + ", Exprience=" + Exprience + "]";
	}
	
	

}
