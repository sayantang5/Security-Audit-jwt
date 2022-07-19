package com.audit.demo.repository;

import com.audit.demo.entity.students;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepo extends JpaRepository<students, Integer > {

}
