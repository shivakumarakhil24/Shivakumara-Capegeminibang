package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Shiva");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
	  Movie data=entityManager.find(Movie.class, 2);
	System.out.println("Id        : "+data.getId()+"\nName      : "+data.getName()+"\nRating    : "+data.getRating());
	
	
	
	
	
	}

}
