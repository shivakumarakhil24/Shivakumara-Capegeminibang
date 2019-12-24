package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicModifyJpql {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		String jpql="update Movie set name=:nm where id=:mid";
		Query q= em.createQuery(jpql);
		q.setParameter("nm", "GantuMoote");
		q.setParameter("mid", 6);
	int count=q.executeUpdate();
	if (count>0) {
		System.out.println("Data is Inserted");
	}
	else 
		System.out.println("Some thing went wrong");
	
	transaction.commit();
		
		
	}

}
