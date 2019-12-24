package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Refecrence {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Shiva");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		// 1.Whene we use this below method, it throws NullpointerException if given the data is not present in the database.
	//  Movie data=entityManager.find(Movie.class, 1);
		// 1.Whene we use this below method, it throws EntityNotFoundException if given the data is not present in the database
		Movie data=entityManager.getReference(Movie.class, 1);
	System.out.println("Id        : "+data.getId()+"\nName      : "+data.getName()+"\nRating    : "+data.getRating());
	
	
	
	
	}

}
