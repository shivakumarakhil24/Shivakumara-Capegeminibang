package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class InserDemoOld {
public static void main(String[] args) {
	

		
		Movie movie=new Movie();
		movie.setId(5);
		movie.setName("Bharate");
		movie.setRating("yet to rel");
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Shiva");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction =entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movie);
		System.out.println("Record is Inserted");	
		transaction.commit();
		
}
}
