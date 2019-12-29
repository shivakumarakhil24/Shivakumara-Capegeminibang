package com.ustglobal.librarymanagementsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagementsystem.dto.UserBean;
import com.ustglobal.librarymanagementsystem.dto.UserResponse;
import com.ustglobal.librarymanagementsystem.service.AdminService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class AdminController {
	@Autowired
	private AdminService service;

	@PostMapping(path = "/registerUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse registerUser(@RequestBody UserBean bean) {
		UserResponse response = new UserResponse();
		if (service.registerUser(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Admin Register Successfully");
			response.setUser(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Admin Not Able To Register Please Provide another Credentials");
		}
		return response;
	}

	@GetMapping(path = "/user-login/{userId}/{userPassword}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse adminLogin(@PathVariable("userId") int userId,
			@PathVariable("userPassword") String userPassword) {
		UserResponse response = new UserResponse();
		UserBean bean = service.userLogin(userId, userPassword);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User Login Successfully");
			response.setUser(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User Not Able To Login");
		}
		return response;
	}

	@PostMapping(path = "/add-student", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addStudent(@RequestBody UserBean bean) {
		UserResponse response = new UserResponse();
		if (service.addStudent(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Student Data added to the DataBase Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Student Data not added to the DataBase");
		}
		return response;
	}

	@PostMapping(path = "/add-librarian", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addLibrarian(@RequestBody UserBean bean) {
		UserResponse response = new UserResponse();
		if (service.addLibrarian(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Librarian Data added to the DataBase Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Librarian Data Not added to the DataBase");
		}
		return response;
	}
	
	@GetMapping(path = "/search-user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchUsers(@PathVariable("userId") int userId) {
		UserResponse response = new UserResponse();
		UserBean bean = service.searchUser(userId);

		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Student Data Found in the DataBase");
			response.setUserBean(Arrays.asList(bean));// in the list it store only one result

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Student Data Not Found in the DataBase");
		}
		return response;
	}

	@GetMapping(path = "/search-allUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchAllStudent() {
		UserResponse response = new UserResponse();
		List<UserBean> bean = service.searchAllUser();
		if (!bean.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Student Data Found in the DataBase");
			response.setUserBean(bean);// in the list it store only one result

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Student Data Not Found in the DataBase");
		}

		return response;
	}

	@DeleteMapping(path = "/delete-user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse removeUser(@PathVariable("userId") int userId) {
		UserResponse response = new UserResponse();
		if (service.removeUser(userId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User Data Removed from the DataBase");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User Data Not Removed from the DataBase");
		}
		return response;
	}

	@PutMapping(path = "/update-user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse modifyUser(@RequestBody UserBean bean) {
		UserResponse response = new UserResponse();
		if (service.updateUser(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User Data Updated in the DataBase");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User Data  Not Updated in the DataBase");
		}
		return response;
	}
}
