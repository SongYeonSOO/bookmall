package com.estsoft.bookmal.vo;

public class MemberVo {
	private Long no;
	private String email;
	private String password;
	private String name;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", email=" + email + ", password=" + password + ", name=" + name + "]";
	}
}
