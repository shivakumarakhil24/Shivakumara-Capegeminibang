package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class ReAttaching {
public static void main(String[] args) {
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	
	try {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Shiva");
        entityManager = entityManagerFactory.createEntityManager();
	    transaction = entityManager.getTransaction();
		transaction.begin();
	    Movie data=	entityManager.find(Movie.class, 4);
	    System.out.println(data.getId());
	    System.out.println(entityManager.contains(data));
	    entityManager.detach(data);
	    System.out.println(entityManager.contains(data));
	    Movie movie1=entityManager.merge(data);
	    System.out.println(entityManager.contains(movie1));
	    movie1.setName("Beatiful heart");
	    
	    
		System.out.println("Record is Updated");
		transaction.commit();
	} 
	
	
	catch (Exception e) {
		
		transaction.rollback();
		e.printStackTrace();
	}
	entityManager.close();
	
	
	
}
}
