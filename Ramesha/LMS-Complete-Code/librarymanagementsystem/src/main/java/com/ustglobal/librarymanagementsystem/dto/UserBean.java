package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserBean {
	@Id
	@Column
	private int userId;
	@Column(length = 20)
	private String userName;
	@Column(length = 20)
	private String userType;
	@Column(unique = true)
	private String userEmail;
	@Column
	private String userPassword;
	@Column(length = 10)
	private String userGender;
	@Column
	private long userMobileNo;

}
