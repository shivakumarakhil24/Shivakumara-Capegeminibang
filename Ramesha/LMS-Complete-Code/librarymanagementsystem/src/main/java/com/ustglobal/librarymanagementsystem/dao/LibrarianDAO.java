package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;
import com.ustglobal.librarymanagementsystem.dto.IssuedBookDetails;

public interface LibrarianDAO {
	public boolean addBook(BookBean bean);

	public BookBean searchBook(String bookName);

	public List<BookBean> searchAllBooks();

	public boolean removeBook(int bookId);

	public boolean issueBook(int studentId, int bookId);

	public boolean acceptRequest(int registrationId);

	public List<BooksRegistration> showAllRequest();

	public List<IssuedBookDetails> showAllIssuedBooks();
}
