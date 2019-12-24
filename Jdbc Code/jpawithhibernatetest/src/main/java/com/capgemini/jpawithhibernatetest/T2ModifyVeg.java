package com.capgemini.jpawithhibernatetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernatetest.dto.Vegetable;

public class T2ModifyVeg {
	public static void main(String[] args) {
		
		
		
		//Vegetable veg=new Vegetable();
		
		
		EntityManager em=null;
		EntityTransaction et=null;
		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			
			
			Vegetable v1=  em.find(Vegetable.class, 10);
			v1.setCost(75);
			
			Vegetable v2=em.find(Vegetable.class, 30);
			v2.setCost(50);
			System.out.println("Record is Modified [pk 10 and 30]");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			et.rollback();
		}
		
		
		
		et.commit();
	
		em.close();
		
	}

}
