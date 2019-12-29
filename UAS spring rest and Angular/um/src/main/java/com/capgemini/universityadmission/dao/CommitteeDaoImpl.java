package com.capgemini.universityadmission.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.springframework.stereotype.Repository;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.Users;

@Repository
public class CommitteeDaoImpl implements CommitteeDao {

	@PersistenceUnit
	EntityManagerFactory emf;

	@Override
	public Users login(Users users) {
		EntityManager em = emf.createEntityManager();
		String jpql = "from  Users where loginId = :loginId and password = :password";
		javax.persistence.Query query = em.createQuery(jpql);
		query.setParameter("loginId", users.getLoginId());
		query.setParameter("password", users.getPassword());
		Users user = null;
		try {
			user = (Users) query.getSingleResult();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return user;
	}

	@Override
	public List<Application> viewAllApplications() {
		EntityManager em = emf.createEntityManager();
		String jpql = "from Application";
		Query query = em.createQuery(jpql);
		List<Application> participantsList = null;
		try {
			participantsList = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return participantsList;
	}

	@Override
	public Application viewParticualrApplication(int applicationId) {
		EntityManager em = emf.createEntityManager();
		Application application = em.find(Application.class, applicationId);
		em.close();

		return application;
	}

	@Override
	public boolean acceptRejectConfirm(int applicationId, String status) {
		EntityManager em = emf.createEntityManager();
		String jpql = "UPDATE Application e SET e.status = :status WHERE e.applicationId = :appId";
		Query query = em.createQuery(jpql);
		query.setParameter("status", status);
		query.setParameter("appId", applicationId);
		try {
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			int st = query.executeUpdate();
			tx.commit();
			if (st > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
}
