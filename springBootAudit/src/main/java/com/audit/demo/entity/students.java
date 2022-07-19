package com.audit.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
public class students extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;
	@Column(name = "studentName")
	private String studentName;
	@Column(name = "Course")
	private String course;
	@Column(name = "exp")
	private int exprience;
	
	
	

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
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getExprience() {
		return exprience;
	}

	public void setExprience(int exprience) {
		this.exprience = exprience;
	}

	@Override
	public String toString() {
		return "students [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course
				+ ", exprience=" + exprience + "]";
	}

	

}
