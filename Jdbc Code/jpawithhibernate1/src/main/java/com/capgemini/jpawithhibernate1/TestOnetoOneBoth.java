package com.capgemini.jpawithhibernate1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.capgemini.jpawithhibernate.dto.Movie;
import com.capgemini.jpawithhibernate.one_to_one.VoterCard;

public class TestOnetoOneBoth {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		/*Person p = new Person();
		p.setPid(2);
		p.setName("Kumar");
		VoterCard vc= new VoterCard();
		vc.setVid(24);
		vc.setAddress("Hebbal");
		p.setVoterCard(vc);*/
		
		
		
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Shiva");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			VoterCard vcard = entityManager.find(VoterCard.class, 22);
			System.out.println(vcard.getAdress());
			System.out.println(vcard.getVid());
			System.out.println("Person's ID: "+vcard.getPer().getPid());
			System.out.println("Person's Name: "+vcard.getPer().getName());
			//System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

}
	}
