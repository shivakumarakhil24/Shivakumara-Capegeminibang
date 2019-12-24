package com.capgemini.jpawithhibernatetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernatetest.dto.Vegetable;

public class T6ReattachdetachVeg {
	public static void main(String[] args) {
	EntityManagerFactory emf=null;
	EntityManager em=null;
	EntityTransaction et=null;
	try {
		emf=Persistence.createEntityManagerFactory("Test");
		em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		Vegetable veg=em.find(Vegetable.class, 20);
		System.out.println("Name of the vegetabel is"+veg.getName());
		System.out.println(em.contains(veg));
		
		em.detach(veg);
		System.out.println(em.contains(veg));
		
		Vegetable veg1=em.merge(veg);
		System.out.println(em.contains(veg1));
		System.out.println("Name of the vegetabel is"+veg.getName());
		System.out.println();
		et.commit();
		
		}
	catch (Exception e) 
	{
		e.printStackTrace();
		
	}
	em.close();
	}

}
