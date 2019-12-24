package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeletJpql {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction trans=em.getTransaction();
		trans.begin();
		String jpql="delete from Movie where id=:nid";
		Query q=em.createQuery(jpql);
		q.setParameter("nid", 2);
		int count=q.executeUpdate();
		if(count>0)
			System.out.println("Data has been deleted");
		else
			System.out.println("Something went wrong");
		trans.commit();
		em.close();
	}
	

}
