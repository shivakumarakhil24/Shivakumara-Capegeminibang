package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class InsertDemo {
	public static void main(String[] args) {
		Movie movie = new Movie();
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		movie.setId(1);
		movie.setName("Diggajaru");
		movie.setRating("super");
		
		try {
			
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Shiva");
	         entityManager = entityManagerFactory.createEntityManager();
			 transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("Record is Inserted");
			transaction.commit();
		} 
		
		
		catch (Exception e) {
			
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
		
	}

}
