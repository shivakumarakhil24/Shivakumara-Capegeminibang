package com.capgemini.universityadmission.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	@Column(name="login_id")
	private Integer loginId;
	@Column
	private String password;
	@Column
	private String role;
	

	
//Getter and Setter

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
