package com.capgemini.jpawithhibernatetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernatetest.dto.Vegetable;

public class T3RemoveVeg {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	et.begin();
	Vegetable v1=em.find(Vegetable.class, 60);
	em.remove(v1);
	System.out.println("The Record with pk 60 is deleted");
	
	Vegetable v2=em.find(Vegetable.class, 50);
	em.remove(v2);
	System.out.println("The Record with pk 50 is deleted");
	et.commit();
	em.close();
}
}
