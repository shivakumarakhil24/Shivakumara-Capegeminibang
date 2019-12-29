package com.capgemini.collectionframework.bean;

import java.util.TreeSet;

public class TreeStudent {
	public static void main(String[] args) {
		TreeSet<Student> tr=new TreeSet<Student>();
		Student s1=new Student();
		s1.setId(12);
		s1.setName("Amruth");
		s1.setPercent(65.4);
		s1.setGender('M');
		
		Student s2=new Student();
		s2.setId(24);
		s2.setName("Supriya");
		s2.setPercent(98.4);
		s2.setGender('F');
		
		Student s3=new Student();
		s3.setId(54);
		s3.setName("Zara");
		s3.setPercent(45.4);
		s3.setGender('F');
		
		Student s4=new Student();
		s4.setId(12);
		s4.setName("Bavan");
		s4.setPercent(69.3);
		s4.setGender('M');
		
		Student s5=new Student();
		s5.setId(34);
		s5.setName("Madhu");
		s5.setPercent(70.4);
		s5.setGender('F');
		
		tr.add(s1);
		tr.add(s2);
		tr.add(s3);
		tr.add(s4);
		tr.add(s5);
		
		
		
		System.out.println("------------Retrieve-----------");
		for(Student st:tr)
		{
			System.out.println("Name is"+st.getName());
			System.out.println("ID is"+st.getId());
			System.out.println("Percet is"+st.getPercent());
			System.out.println("Gender is"+st.getGender());
		}
		
		
		
		
		
	}

}
