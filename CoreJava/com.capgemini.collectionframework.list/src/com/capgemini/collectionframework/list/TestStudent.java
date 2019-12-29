package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(3,"ARUN","PES");
		Student s2=new Student(1,"Gokul","PESIT");
		Student s3=new Student(42,"Neelam","Daman");
		Student s4=new Student(41, "Kiran","Acharya IT");
		Student s5=new Student(120, "Sheela", "RvCE");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		
		
		
		
		
		//Retrieving-------------------
		System.out.println("==-----------Using ForEach-------------==");
		for(Student st:al)
		{
			System.out.println(" Sudent ID is "+st.id+" and Name  is  "+st.name+" Studying in  "+st.college+"college");
		}
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("=--------------Using normal for----------=====");
		for(int i=0;i<al.size();i++)
		{
			Student sf=al.get(i);
			System.out.println(" Sudent ID is "+sf.id+" and Name  is  "+sf.name+" Studying in  "+sf.college+"college");
			
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("--------Using Iterator----------------");
		Iterator<Student> i1=al.iterator();
		while(i1.hasNext())
		{
			Student si=i1.next();
			System.out.println(" Sudent ID is "+si.id+" and Name  is  "+si.name+" Studying in  "+si.college+"college");
			
		}
		System.out.println();
		System.out.println();
		System.out.println("------------------Using ListIterator---------");
		
		ListIterator<Student> d=al.listIterator();
		System.out.println("============Forword========");
		while(d.hasNext())
		{
			Student si=d.next();
			System.out.println(" Sudent ID is "+si.id+" and Name  is  "+si.name+" Studying in  "+si.college+"college");
				
		}
		System.out.println();
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<<Back backward<<<<<<<<<<<<<<<<<<<");
		
	
		while(d.hasPrevious())
			
		{
			Student si=d.previous();
			System.out.println(" Sudent ID is "+si.id+" and Name  is  "+si.name+" Studying in  "+si.college+"college");
				
		}
		
	}

}
