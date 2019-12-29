package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;

public interface StudentService {
	public BookBean searchBookByName(String bookName);

	public List<BookBean> searchAllBooks();

	public boolean requestBook(BooksRegistration bean);

	public boolean cancelRequest(int registrationId);

}
