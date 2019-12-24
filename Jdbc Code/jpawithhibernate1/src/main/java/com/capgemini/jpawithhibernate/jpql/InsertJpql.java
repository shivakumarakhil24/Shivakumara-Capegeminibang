package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertJpql {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		String jpql="insert into Movie values(1,'Aptham','Horror')";
		Query q= em.createNativeQuery(jpql);
	int count=q.executeUpdate();
	if (count>0) {
		System.out.println("Data is Inserted");
	}
	else 
		System.out.println("Some thing went wrong");
	
	transaction.commit();
}
}