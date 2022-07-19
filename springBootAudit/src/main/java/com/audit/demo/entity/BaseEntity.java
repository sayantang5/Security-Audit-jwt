package com.audit.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

	@Column(name="created_on" ,updatable=false)
	@CreatedDate
	private LocalDateTime created_on;
	
	@Column(name="modified_on",insertable=false)
	@LastModifiedDate
	private LocalDateTime modified_on;
	
	
	@CreatedBy
	@Column(name="created_by",updatable= false)
	private String name;
	
	
	@LastModifiedBy
	@Column(name="updated_by" ,insertable=false)
	private String updatedBy;
	
}
