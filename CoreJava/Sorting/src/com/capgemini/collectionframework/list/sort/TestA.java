package com.capgemini.collectionframework.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<Student>();
		Student s1=new Student(1, "Priya", 65.4);
		Student s2=new Student(5, "Anil", 42.3);
		Student s3=new Student(3, "Dinesh", 51.6);
		Student s4=new Student(2, "Raju", 76.8);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		Collections.sort(a);
		Iterator<Student> i1=a.iterator();
		while(i1.hasNext())
		{
			Student st=i1.next();
			
	System.out.println("Student name is:"+st.name+"\nId is          :"+st.id+"\nPercent       "
	+" :"+st.percent);
	System.out.println();
	System.out.println();
	System.out.println();
		}
		
		
		
		
	}

}
