package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public BookBean searchBookByName(String bookName) {
		String jpql = "from BookBean where  bookName=:bookName";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BookBean> query = manager.createQuery(jpql, BookBean.class);
		query.setParameter("bookName", bookName);
		try {
			BookBean bean = query.getSingleResult();
			return bean;
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
	public boolean requestBook(BooksRegistration bean) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean cancelRequest(int registrationId) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			BooksRegistration reg = entityManager.find(BooksRegistration.class, registrationId);
			entityManager.remove(reg);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			return false;
		}
	}

}
