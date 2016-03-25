package com.estsoft.bookmal.vo;

public class BookVo {
	private Long no;
	private String title;
	private Long categoryNo;
	private String categoryName;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", categoryNo=" + categoryNo + ", categoryName=" + categoryName
				+ "]";
	}
}
