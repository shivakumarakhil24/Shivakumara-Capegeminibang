package com.capgemini.jpawithhibernatetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernatetest.dto.Vegetable;

public class T5ReadReferenceVeg {
	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction et=null;
		try {
			emf=Persistence.createEntityManagerFactory("Test");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			Vegetable veg= em.getReference(Vegetable.class, 90);
			System.out.println("Name  :"+veg.getName()+"\n id    :"+veg.getVid()+"\n cost  :"+veg.getCost());
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}	



	}

}
