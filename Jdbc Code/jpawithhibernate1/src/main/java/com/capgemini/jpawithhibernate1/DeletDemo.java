package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class DeletDemo {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		
		try {
			
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Shiva");
	        entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
		    Movie data=	entityManager.find(Movie.class, 1);
		    entityManager.remove(data);
			System.out.println("Record is delet");
			transaction.commit();
		} 
		
		
		catch (Exception e) {
			
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
		
	}
}
