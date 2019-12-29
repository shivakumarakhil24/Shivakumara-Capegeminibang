package com.ustglobal.librarymanagementsystem.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;
import com.ustglobal.librarymanagementsystem.dto.IssuedBookDetails;
import com.ustglobal.librarymanagementsystem.dto.UserBean;

@Repository
public class LibrarianDAOImpl implements LibrarianDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addBook(BookBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public BookBean searchBook(String bookName) {
		String jpql = "from BookBean where  bookName=:bookName";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BookBean> query = manager.createQuery(jpql, BookBean.class);
		query.setParameter("bookName", bookName);
		try {
			BookBean bean = query.getSingleResult();
			return (BookBean) bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<BookBean> searchAllBooks() {
		String jpql = "from BookBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BookBean> query = manager.createQuery(jpql, BookBean.class);

		try {
			List<BookBean> bean = query.getResultList();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean issueBook(int studentId, int bookId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		LocalDate todayDate = LocalDate.now();
		LocalDate retDate = LocalDate.of(todayDate.getYear(), todayDate.getMonth(), todayDate.getDayOfMonth() + 10);
		transaction.begin();
		try {
			UserBean bean = manager.find(UserBean.class, studentId);
			BookBean bookBean = manager.find(BookBean.class, bookId);
			IssuedBookDetails details = new IssuedBookDetails();
			details.setBook(bookBean);
			details.setUser(bean);
			details.setIssuedDate(todayDate);
			details.setReturnDate(retDate);
			manager.persist(details);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}

	@Override
	public boolean removeBook(int bookId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			BookBean bean = manager.find(BookBean.class, bookId);
			if (bean != null) {
				manager.remove(bean);
				transaction.commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean acceptRequest(int registrationId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BooksRegistration bean = manager.find(BooksRegistration.class, registrationId);
		if (bean != null) {
			manager.contains(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<BooksRegistration> showAllRequest() {
		EntityManager entityManager = factory.createEntityManager();
		String viewRegistrationDetails = "from BooksRegistration";
		Query query = entityManager.createQuery(viewRegistrationDetails);

		List<BooksRegistration> bookDetails = query.getResultList();
		return bookDetails;
	}

	@Override
	public List<IssuedBookDetails> showAllIssuedBooks() {
		String jpql = "from IssuedBookDetails";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<IssuedBookDetails> query = manager.createQuery(jpql, IssuedBookDetails.class);

		try {
			List<IssuedBookDetails> bean = query.getResultList();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}