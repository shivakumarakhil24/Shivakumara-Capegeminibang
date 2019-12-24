package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.capgemini.jpawithhibernate.dto.Movie;
import com.capgemini.jpawithhibernate.one_to_one.Person;
import com.capgemini.jpawithhibernate.one_to_one.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {
		Person person=new Person();
		person.setPid(11);
		person.setName("Shankar");

		VoterCard vcard=new VoterCard();
		vcard.setAdress("RajajiNagar Banglore");
		vcard.setVid(10);
		person.setVoterCard(vcard);
		EntityManager entityManager=null;
		EntityTransaction transaction=null;



		try {


			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Shiva");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(person);
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
