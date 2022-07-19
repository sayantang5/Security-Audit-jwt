package com.audit.demo.service;

import java.util.List;

import com.audit.demo.dto.studentDTO;
import com.audit.demo.dto.studentInqueryPaginationDTO;
import com.audit.demo.entity.students;

public interface studentService {
	
	public students saveStudent(studentDTO student);
	public List<studentDTO> findAll();
	public studentDTO getStudentById( int id);
	
	public studentInqueryPaginationDTO ShowallstudentwithPagination(int pageNum, String fieldName, String sortDir);
    public  void deleteStudentById(int id);
}
