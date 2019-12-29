package com.capgemini.collectionframework.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestStudent {
	public static void main(String[] args) {
		
	
	LinkedHashMap<String, ArrayList<Student>> mh= new LinkedHashMap<String,ArrayList<Student>>();
	
	
	ArrayList<Student> a1=new ArrayList<Student>();
	Student s1=new Student(1, "Ammu",65.5);
	Student s2=new Student(11, "Amar",75.5);
	Student s3=new Student(21, "Abhishek",55.5);
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	
	ArrayList<Student> a2=new ArrayList<Student>();
	Student s4=new Student(2, "Bavya",71.6);
	Student s5=new Student(12, "Banu",77.6);
	Student s6=new Student(22, "Basanth",85.5);
	a2.add(s4);
	a2.add(s5);
	a2.add(s6);
	
	ArrayList<Student> a3=new ArrayList<Student>();
	Student s7=new Student(3, "Cat",44.6);
	Student s8=new Student(13, "Cow",78.6);
	Student s9=new Student(23, "Chora",95.5);
	a3.add(s7);
	a3.add(s8);
	a3.add(s9);
	mh.put("First",a1);
	mh.put("Second",a2);
	mh.put("Third",a3);
	
	ArrayList<Student> al=mh.get("Third");
	Iterator<Student> i1=al.iterator();
	while(i1.hasNext())
	{
		Student sd=i1.next();
		System.out.println("Name :"+sd.name+"\n Id :"+sd.id+"\nPercent :"+sd.percent);
		System.out.println();
		
		
	}
	
	
	}
}
