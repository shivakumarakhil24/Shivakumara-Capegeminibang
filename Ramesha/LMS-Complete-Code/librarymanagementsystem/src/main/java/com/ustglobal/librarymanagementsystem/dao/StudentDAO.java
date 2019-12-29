package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;

public interface StudentDAO {
	public BookBean searchBookByName(String bookName);

	public List<BookBean> searchAllBooks();

	public boolean requestBook(BooksRegistration bean);

	public boolean cancelRequest(int registrationId);
}
