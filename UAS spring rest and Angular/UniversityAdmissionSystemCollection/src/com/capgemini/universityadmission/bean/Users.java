package com.capgemini.universityadmission.bean;

public class Users {

	private String loginId;
	private String password;
	private String role;

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public String setRole(String role) {
		return this.role = role;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	@Override
	public String toString() {
		return "Users [loginId=" + loginId + ", password=" + password + ", role=" + role + "]";
	}

	

}
