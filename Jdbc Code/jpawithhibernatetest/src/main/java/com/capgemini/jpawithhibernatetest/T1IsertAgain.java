package com.capgemini.jpawithhibernatetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernatetest.dto.Vegetable;
//We can insert the data to the database without Try catch also in the hibernate.

public class T1IsertAgain {
	public static void main(String[] args) {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Vegetable veg=new Vegetable();
		veg.setVid(70);
		veg.setName("BeetRoot");
		veg.setCost(28);
		
		Vegetable veg1=new Vegetable();
		veg1.setVid(80);
		veg1.setName("Barriate");
		veg1.setCost(90);
		
		et.begin();
		em.persist(veg);
		em.persist(veg1);
		
		System.out.println("record inserted database");
		et.commit();
		
		
		
	}

}
