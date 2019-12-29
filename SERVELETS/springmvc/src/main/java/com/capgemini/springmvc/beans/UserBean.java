package com.capgemini.springmvc.beans;

import java.util.Date;

public class UserBean {
	//These data members name should matches the values in the LoginForm[HTML]
	private int empId;
	private String password;
	private Date dob;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
