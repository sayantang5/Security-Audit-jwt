package com.audit.demo.service;

import java.util.Arrays;
import java.util.List;

import com.audit.demo.dto.pageInfoDTO;
import com.audit.demo.dto.studentDTO;
import com.audit.demo.dto.studentInqueryPaginationDTO;
import com.audit.demo.entity.students;
import com.audit.demo.repository.studentrepo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class studentServiceImpl implements studentService{

	
	@Autowired
	studentrepo studentrepository;
	
	@Autowired
	ModelMapper modelmapper;
	
	@Override
	public students saveStudent(studentDTO student) {
		
		students mappedstudent = modelmapper.map(student, students.class);
		
		
		
		students savedstudent = studentrepository.save(mappedstudent);
		
		return savedstudent;
	}

	@Override
	public List<studentDTO> findAll() {

		List<students> findAll = studentrepository.findAll();
		
		studentDTO[] map = modelmapper.map(findAll, studentDTO[].class);
		
		
		 List <studentDTO> asDTOList =Arrays.asList(map);
		
		
		return asDTOList;
	}

	@Override
	public studentDTO getStudentById(int id) {
		
		students studentbyid = studentrepository.getById(id);
		
		studentDTO student = modelmapper.map(studentbyid, studentDTO.class);
		
		
		return student;
	}

	@Override
	public studentInqueryPaginationDTO ShowallstudentwithPagination(int pageNum,String fieldName,String sortDir) {
      
		
		
      studentInqueryPaginationDTO paginationDTO = new studentInqueryPaginationDTO();
      pageInfoDTO pageinfodto = new pageInfoDTO();
      
      Sort sort=Sort.by(fieldName);
      sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
      
      
      PageRequest request = PageRequest.of(pageNum-1,2,sort);
      Page<students> findAll = studentrepository.findAll(request);
      List<students> content = findAll.getContent();
      studentDTO[] map = modelmapper.map(content, studentDTO[].class);
      
      List<studentDTO> asList = Arrays.asList(map);
      
      pageinfodto.setCurrentPage(pageNum);
      pageinfodto.setPageSize(findAll.getSize());
      pageinfodto.setTotalPage(findAll.getTotalPages());
      pageinfodto.setTotalRecord(findAll.getTotalElements());
      
      
      paginationDTO.setPageinfo(pageinfodto);
      paginationDTO.setStudentdto(asList);
      
		
		return paginationDTO;
	}

	@Override
	public void deleteStudentById(int id) {
		
		studentrepository.deleteById(id);
		
		
	}

}
