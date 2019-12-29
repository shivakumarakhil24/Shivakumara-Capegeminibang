package com.capgemini.universityadmission.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;

@Repository
public class ApplicantDaoImpl implements ApplicantDao{
	
	@PersistenceUnit
	EntityManagerFactory emf;

	@Override
	public List<ProgramsOffered> viewAllPrograms() {
		EntityManager em=emf.createEntityManager();
		String jpql = "from ProgramsOffered";
		Query query = em.createQuery(jpql);
		List<ProgramsOffered> programsList = null;
		try {
			programsList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return programsList;		
	}

	@Override
	public boolean apply(Application application) {
		EntityManager em= emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		boolean isAdded = false;
		try {
			tx.begin();
			em.persist(application);
			tx.commit();
			isAdded = true;
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return isAdded;
	}

	@Override
	public List<String> viewStatus(int applicationId) {
		EntityManager em=emf.createEntityManager();
		String jpql = "select status from Application where applicationId=:applicationId ";
		Query query = em.createQuery(jpql);
		query.setParameter("applicationId", applicationId);
		List<String> status = query.getResultList();
		
		return status;		
	}

	}




