package com.capgemini.jpawithhibernatetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernatetest.dto.Vegetable;

public class A1Insert {
	public static void main(String[] args) {
		Vegetable veg=new Vegetable();
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction tranc=null;
		
		veg.setVid(60);
		veg.setName("LadyFinger");
		veg.setCost(45);
		
		
		 try {
			 emf=Persistence.createEntityManagerFactory("Test");
			 em=emf.createEntityManager();
			 tranc=em.getTransaction();
			tranc.begin();
			em.persist(veg);
			System.out.println("record is inserted");
			tranc.commit();
		} 
		 catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
		
		
	}

}
