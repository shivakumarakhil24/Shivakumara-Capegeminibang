package com.ustglobal.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.librarymanagementsystem.dto.UserResponse;

@RestControllerAdvice
public class HandlingException {

	public UserResponse getException() {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got exception");
		return response;
	}
}
