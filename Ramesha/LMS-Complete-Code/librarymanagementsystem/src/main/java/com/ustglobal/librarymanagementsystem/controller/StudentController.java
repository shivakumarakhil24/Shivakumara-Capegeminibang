package com.ustglobal.librarymanagementsystem.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;
import com.ustglobal.librarymanagementsystem.dto.UserResponse;
import com.ustglobal.librarymanagementsystem.service.StudentService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping(path = "/search-bookByName/{bookName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchBookByName(@PathVariable("bookName") String bookName) {
		UserResponse response = new UserResponse();
		BookBean bean = service.searchBookByName(bookName);

		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book is Available in the Library");
			response.setBookBean(Arrays.asList(bean));// in the list it store only one result

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book is Not Available in the Library ");
		}
		return response;
	}

	@GetMapping(path = "/search-allbooks", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchAllBook() {
		UserResponse response = new UserResponse();
		List<BookBean> bean = service.searchAllBooks();
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Books is available in library");
			response.setBookBean(bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book is Not available in library");
		}

		return response;
	}

	@GetMapping("requestBook/{studentId}/{bookId}")
	public UserResponse requestBook(@PathVariable(name = "studentId") int studentId,
			@PathVariable(name = "bookId") int bookId) {
		UserResponse response = new UserResponse();
		BooksRegistration bean = new BooksRegistration();
		bean.setBookId(bookId);
		bean.setStudentId(studentId);
		Date todayDate = new Date();
		bean.setRegistrationDate(todayDate);
		boolean reg = service.requestBook(bean);
		if (reg != false) {
			response.setStatusCode(201);
			response.setMessage("Success");

			response.setDescription("Book Request Successfully");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book Request is Failed");
		}
		return response;
	}

	@PostMapping("cancelRequest/{registrationId}")
	public UserResponse cancelBookRequest(@PathVariable(name = "registrationId") int registrationId) {
		UserResponse response = new UserResponse();
		boolean check = service.cancelRequest(registrationId);
		if (check) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("The Request for book is Canceled");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book Request is not Canceld");
		}
		return response;
	}

}
