package com.capgemini.student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.student.beans.StudentBean;

public class StudentDAOJpaImpl implements StudentDAO {

	@Override
	public StudentBean getStudent(int s_id) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Shiva");
		EntityManager em= emf.createEntityManager();
		StudentBean studentBean =  em.find(StudentBean.class, s_id);
		emf.close();
		em.close();



		return studentBean;
	}



}
