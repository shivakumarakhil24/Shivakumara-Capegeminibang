package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.dao.StudentDAO;
import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;
import com.ustglobal.librarymanagementsystem.validation.Validation;

@Service
public class StudenServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;

	@Autowired
	private Validation valid;

	@Override
	public BookBean searchBookByName(String bookName) {
		if (bookName != null && valid.validateName(bookName)) {
			return dao.searchBookByName(bookName);
		} else {
			return null;
		}

	}

	@Override
	public List<BookBean> searchAllBooks() {
		return dao.searchAllBooks();
	}

	@Override
	public boolean requestBook(BooksRegistration bean) {
		if (bean != null) {
			return dao.requestBook(bean);
		} else {
			return false;
		}

	}

	@Override
	public boolean cancelRequest(int registrationId) {
		if (registrationId != 0) {
			return dao.cancelRequest(registrationId);
		} else {
			return false;
		}

	}

}
