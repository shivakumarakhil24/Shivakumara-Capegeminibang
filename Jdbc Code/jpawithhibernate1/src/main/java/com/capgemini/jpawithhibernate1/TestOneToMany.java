package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.one_to_many.Pencil;
import com.capgemini.one_to_many.PencilBox;

public class TestOneToMany {
	public static void main(String[] args) {
		PencilBox pb = new PencilBox();
		pb.setBox_id(10);
		pb.setName("Camlin");

		Pencil p = new Pencil();
		p.setP_id(4);
		p.setColor("Grey");
		p.setPenBox(pb);

		Pencil p1 = new Pencil();
		p1.setP_id(44);
		p1.setColor("blue");
		p1.setPenBox(pb);
		
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		try {

			emf = Persistence.createEntityManagerFactory("Shiva");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(p);
			em.persist(p1);
			System.out.println("Record is Inserted");
			et.commit();
		}

		catch (Exception e) {

			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}

}
