package com.capgemini.jpawithhibernatetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.capgemini.jpawithhibernatetest.dto.Vegetable;

//1.If You want to see the query in the console give this below line of code in the persistence.xml file
//<property name="hibernate.show_sql" value="true"/>

public class T4ReadVeg {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	et.begin();
	for (int i = 10; i < 50; i=i+10)
	{
		Vegetable veg=em.find(Vegetable.class, i);
		System.out.println("Name  :"+veg.getName()+"\n id    :"+veg.getVid()+"\n cost  :"+veg.getCost());	
	}
	et.commit();
	em.close();
}
}
