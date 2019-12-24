package com.capgemini.jpawithhibernate1;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many.Course;
import many_to_many.Student;


public class TestMtMBi {

	
		public static void main(String[] args) {
			
			Course course=new Course();
			course.setCid(110);
			course.setCname("Java");
			
			Course course1=new Course();
			course1.setCid(210);
			course1.setCname("SQL");
			
			ArrayList<Course> aList=new ArrayList<Course>();
			aList.add(course);
			aList.add(course1);
			
			
			
			
			Student student=new Student();
			student.setSid(10);
			student.setSname("AnkithKumar");
			student.setCourse(aList);
			
			
			
			EntityManagerFactory emf = null;
			EntityManager em = null;
			EntityTransaction et = null;

			try {

				emf = Persistence.createEntityManagerFactory("Shiva");
				em = emf.createEntityManager();
				et = em.getTransaction();
				et.begin();
				//em.persist(student);
				Course course2=em.find(Course.class, 110);
				course2.getStudent().get(0).getSname();
				System.out.println("Student name:\n"+course2.getStudent().get(0).getSname());
				et.commit();
			}

			catch (Exception e) {

				e.printStackTrace();
				et.rollback();
			}
			em.close();
		}

	}



