package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class RetrieveJpql {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Shiva");
		EntityManager em=emf.createEntityManager();
		String jpql="from Movie";
		Query query=em.createQuery(jpql);
		List<Movie> list=query.getResultList();
		for(Movie m:list)
		{
			System.out.println("Movie code: "+m.getId()+"\nMovie name : "+m.getName()+"\nMovie rating: "+m.getRating());
			System.out.println("_____________________________________");
		}
		
		
		
	}

}
