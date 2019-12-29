package com.ustglobal.librarymanagementsystem.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserResponse {
	private int statusCode;
	private String message;
	private String description;
	private UserBean user;
	private List<UserBean> UserBean;
	private List<BookBean> bookBean;
	private List<BooksRegistration> reg;
	private List<IssuedBookDetails> details;
}
