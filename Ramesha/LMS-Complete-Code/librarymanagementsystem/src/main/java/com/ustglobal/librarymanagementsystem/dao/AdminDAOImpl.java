package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagementsystem.dto.UserBean;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public UserBean userLogin(int userId, String userPassword) {
		String jpql = "from UserBean where userId=:userId and userPassword=:userPassword";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
		query.setParameter("userId", userId);
		query.setParameter("userPassword", userPassword);
		try {
			UserBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean addStudent(UserBean bean) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			bean.setUserType("Student");
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addLibrarian(UserBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {

			bean.setUserType("Librarian");
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<UserBean> searchAllUser() {
		String jpql = "from UserBean";
		EntityManager manager = factory.createEntityManager();
		try {
			TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
			List<UserBean> bean = query.getResultList();
			return bean;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public UserBean searchUser(int userId) {
		EntityManager entityManager = factory.createEntityManager();
		UserBean user = entityManager.find(UserBean.class, userId);
		if (user != null) {
			return user;
		} else {
			return null;
		}

	}

	@Override
	public boolean registerUser(UserBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		bean.setUserType("Admin");
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean removeUser(int userId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		UserBean bean = manager.find(UserBean.class, userId);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateUser(UserBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			UserBean userBean = manager.find(UserBean.class, bean.getUserId());
			userBean.setUserType(bean.getUserType());
			userBean.setUserName(bean.getUserName());
			userBean.setUserPassword(bean.getUserPassword());
			userBean.setUserEmail(bean.getUserEmail());
			userBean.setUserGender(bean.getUserGender());
			userBean.setUserMobileNo(bean.getUserMobileNo());
			userBean.setUserId(bean.getUserId());
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
