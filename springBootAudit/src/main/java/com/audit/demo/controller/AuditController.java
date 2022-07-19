package com.audit.demo.controller;

import java.util.List;

import com.audit.demo.dto.pageInfoDTO;
import com.audit.demo.dto.studentDTO;
import com.audit.demo.dto.studentInqueryPaginationDTO;
import com.audit.demo.entity.students;
import com.audit.demo.service.studentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({ "allStudent","pageInfo"})
@Controller
public class AuditController {

	@Autowired
	studentService studentservice;

	@GetMapping("/welcome")
	public String showHome(Model model) {

		studentDTO dto = new studentDTO();
		dto.setStudentName(" ");
		dto.setCourse(" ");
		dto.setExprience(00);

		model.addAttribute("model", dto);

		return "Home-page";

	}

	// submitEnquiry

	@GetMapping("/submitEnquiry")
	public String submitStudentInfo(studentDTO student) {

		System.out.println("student info :" + student);

		students saveStudent = studentservice.saveStudent(student);

		if (!(saveStudent.getStudentId() == 0)) {

			return "savedStudenthtml";
		}

		return "notSaved";

	}

	@GetMapping("/findAll")
	public String Showallstudent(Model model
			) {

		//model.addAttribute("allStudent", studentdto);
		//model.addAttribute("pageInfo", pageinfo);
		
		

		return ShowallstudentwithPagination(1,"exprience","asc",model);

	}

	@GetMapping("/page")
	public String ShowallstudentwithPagination(@RequestParam("pageNo") int pageNo,
			@RequestParam("shortBy")String shortBy,
			@RequestParam("shortdir")String shortdir ,
			Model model) {

		studentInqueryPaginationDTO showallstudentwithPagination = studentservice.ShowallstudentwithPagination(pageNo, shortBy, shortdir);
		pageInfoDTO pageinfo = showallstudentwithPagination.getPageinfo();
		List<studentDTO> studentdto = showallstudentwithPagination.getStudentdto();

		model.addAttribute("allStudent", studentdto);
		model.addAttribute("pageInfo", pageinfo);
		model.addAttribute("shortdir",shortdir );
		model.addAttribute("shortBy",shortdir);
		
		String reversort = shortdir.equals("asc")? "desc" :"asc";
		
		model.addAttribute("reversort",reversort);

		return "show-student";

	}

	// updateStudent

	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("studentId") int id, Model model,@SessionAttribute("pageInfo") pageInfoDTO pageinfo) {

		studentDTO studentDTO = studentservice.getStudentById(id);
		model.addAttribute("model", studentDTO);
		
		System.out.println(pageinfo);

		return "Home-page";

	}
	
	
	//deleteStudent
	
	@GetMapping("/deleteStudent")
	public String updateStudent(@RequestParam("studentId") int id) {

		studentservice.deleteStudentById(id);
		

		return "redirect:/findAll";

	}
	
	
	

}
