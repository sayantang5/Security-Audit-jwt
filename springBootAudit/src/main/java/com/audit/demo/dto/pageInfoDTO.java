package com.audit.demo.dto;

public class pageInfoDTO {
	
	
	
	private int pageSize;
	private long totalRecord;
	private int currentPage;
	private int totalPage;
	

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(long totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "pageInfoDTO [pageSize=" + pageSize + ", totalRecord=" + totalRecord + ", currentPage=" + currentPage
				+ ", totalPage=" + totalPage + "]";
	}
	
	

}
