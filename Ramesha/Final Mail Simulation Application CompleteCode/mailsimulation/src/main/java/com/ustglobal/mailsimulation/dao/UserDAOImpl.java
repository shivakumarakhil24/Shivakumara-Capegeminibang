package com.ustglobal.mailsimulation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.mailsimulation.dto.Mail_info;
import com.ustglobal.mailsimulation.dto.User_info;

@Repository
public class UserDAOImpl implements UserDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public User_info loginUser(String email, String password) {
		String jpql = "from User_info where email=:email and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<User_info> query = manager.createQuery(jpql, User_info.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			User_info bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean registerUser(User_info user) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean changePassword(User_info user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "from User_info where email=:email";
		TypedQuery<User_info> query = manager.createQuery(jpql, User_info.class);
		query.setParameter("email", user.getEmail());
		try {
			transaction.begin();
			User_info user_info = query.getSingleResult();
			User_info bean = manager.find(User_info.class, user_info.getId());
			bean.setPassword(user.getPassword());
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Mail_info> getAllMail() {
		String jpql = "from Mail_info ";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Mail_info> query = manager.createQuery(jpql, Mail_info.class);
		return query.getResultList();

	}

	@Override
	public boolean deleteMail(Mail_info bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			bean.setStatus("deleted");
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean draftMail(Mail_info bean, User_info to, User_info from) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		bean.setUser(from);
		bean.setUser_info(to);
		bean.setStatus("drafted");
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
	public List<Mail_info> deletedMail(Mail_info info) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Mail_info bean = manager.find(Mail_info.class, info.getMid());
		if (bean.getStatus() == "deleted") {
			return (List<Mail_info>) manager.find(Mail_info.class, info.getMid());
		} else {
			return null;
		}
	}

	@Override
	public List<Mail_info> sent(Mail_info info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Mail_info bean = manager.find(Mail_info.class, info.getMid());
		if (bean.getStatus() == "sent") {
			return (List<Mail_info>) bean;
		} else {
			return null;
		}
	}

	@Override
	public List<Mail_info> draft(Mail_info info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Mail_info bean = manager.find(Mail_info.class, info.getMid());
		if (bean.getStatus() == "draft") {
			return (List<Mail_info>) bean;
		} else {
			return null;
		}
	}

	@Override
	public boolean sendMail(String subject, String msg, int to_id, int from_id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		User_info to = manager.find(User_info.class, to_id);

		User_info from = manager.find(User_info.class, from_id);

		Mail_info bean = new Mail_info();
		bean.setUser(from);
		bean.setUser_info(to);
		bean.setStatus("sent");
		bean.setMessage(msg);
		bean.setSubject(subject);
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
	public boolean deleteMailById(int mid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			Mail_info mailBean = manager.find(Mail_info.class, mid);
			mailBean.setStatus("deleted");
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
}
