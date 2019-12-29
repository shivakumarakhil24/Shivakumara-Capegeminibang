package com.capgemini.collectionframework.list.sort;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LInkHSEmp {
	public static void main(String[] args) {
		
	
	LinkedHashSet<Employee> hs=new LinkedHashSet<Employee>();
	Employee e1=new Employee(11, "Madhu", 150.2);
	Employee e2=new Employee(22, "Hemanth", 120.8);
	Employee e3=new Employee(55, "Nagbhushan", 100.9);
	Employee e4=new Employee(33, "Krishna", 80.5);
	Employee e5=new Employee(1, "Girish", 1500.2);
	
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);

	
	System.err.println("---------Using Iterator-----------");
	Iterator<Employee> i1=hs.iterator();
	while(i1.hasNext())
	{
		Employee ep=i1.next();
		System.out.println("Employee name is "+ep.name+"\nId is "+ep.id+"\nSalary :"+ep.salary);
		System.out.println("+-----------------------------------------+");
	}
	
	
	}
}
