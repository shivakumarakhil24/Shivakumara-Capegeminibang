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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;
import com.ustglobal.librarymanagementsystem.dto.IssuedBookDetails;
import com.ustglobal.librarymanagementsystem.dto.UserResponse;
import com.ustglobal.librarymanagementsystem.service.LibrarianService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class LibrarianController {
	@Autowired
	private LibrarianService service;

	@PostMapping(path = "/add-book", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addStudent(@RequestBody BookBean bean) {
		UserResponse response = new UserResponse();
		if (service.addBook(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book is added to the Library");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book is not added to the Library ");
		}
		return response;
	}

	@GetMapping(path = "/search-book/{bookName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchBookByName(@PathVariable("bookName") String bookName) {
		UserResponse response = new UserResponse();
		BookBean bean = service.searchBook(bookName);

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

	@GetMapping(path = "/search-all-books", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse searchAllBook() {
		UserResponse response = new UserResponse();
		List<BookBean> bean = service.searchAllBooks();
		if (!bean.isEmpty()) {
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

	@DeleteMapping(path = "/remove-book/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse removeBook(@PathVariable("bookId") int bookId) {
		UserResponse response = new UserResponse();
		if (service.removeBook(bookId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book Removed from the DataBase");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book Not Removed from the DataBase");
		}
		return response;
	}

	@GetMapping(path = "/accept-request/{registrationId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse acceptRequest(@PathVariable("registrationId") int registrationId) {
		UserResponse response = new UserResponse();
		if (service.acceptRequest(registrationId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Requesting for Book is Accepted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book request is not accepted");
		}
		return response;
	}

	@DeleteMapping(path = "/issue-book/{studentId}/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse issueBook(@PathVariable("studentId") int studentId, @PathVariable("bookId") int bookId) {
		UserResponse response = new UserResponse();
		IssuedBookDetails details = new IssuedBookDetails();
		if (service.issueBook(studentId, bookId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book is Issued Successfully");
			System.out.printf("Please Remember Your Registration Id ", details.getId());
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book is Not Issued ");
		}
		return response;
	}

	@GetMapping(path = "/showAllRequests", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse showAllRequest() {
		List<BooksRegistration> bookList = service.showAllRequest();
		UserResponse response = new UserResponse();
		if (bookList != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("All Book Requests");
			response.setReg(bookList);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No Book Request");
		}
		return response;
	}// end of showAllRequests

	@GetMapping(path = "/show-allIssuedBooks", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse showAllIssuedBook() {
		UserResponse response = new UserResponse();
		List<IssuedBookDetails> bean = service.showAllIssuedBooks();
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("All Issued Books Details");
			response.setDetails(bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No Books Are Issued");
		}

		return response;
	}

}
