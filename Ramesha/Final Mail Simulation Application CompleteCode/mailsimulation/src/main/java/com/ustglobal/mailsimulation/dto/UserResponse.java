package com.ustglobal.mailsimulation.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<User_info> info;
	private List<Mail_info> mailinfo;

}
