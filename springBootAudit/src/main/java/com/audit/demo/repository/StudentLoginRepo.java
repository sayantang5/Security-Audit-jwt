package com.audit.demo.repository;

import com.audit.demo.entity.Studentlogin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentLoginRepo extends JpaRepository<Studentlogin, Integer> {

	
	public Studentlogin findByemail(String username);
	
	
}
