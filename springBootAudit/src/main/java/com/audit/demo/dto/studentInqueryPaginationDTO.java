package com.audit.demo.dto;

import java.util.List;

public class studentInqueryPaginationDTO {
	
	private List<studentDTO> studentdto;
	
	private pageInfoDTO pageinfo;

	public List<studentDTO> getStudentdto() {
		return studentdto;
	}

	public void setStudentdto(List<studentDTO> studentdto) {
		this.studentdto = studentdto;
	}

	public pageInfoDTO getPageinfo() {
		return pageinfo;
	}

	public void setPageinfo(pageInfoDTO pageinfo) {
		this.pageinfo = pageinfo;
	}
	
	
	
	

}
