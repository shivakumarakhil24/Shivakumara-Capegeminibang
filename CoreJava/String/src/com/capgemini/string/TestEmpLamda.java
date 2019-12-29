package com.capgemini.string;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmpLamda {

	
	public static void main(String[] args) {
		Comparator<Employee> c=(e1,e2) ->
		{
			if(e1.id>e2.id)
			{
				return 1;
				
			}
			else if(e1.id<e2.id)
				return -1;
			else 
				return 0;
		};
		
		
		
		TreeSet<Employee> tr=new TreeSet<Employee>(c);
		Employee e1=new Employee(16, "Amulya", 5.2);
		Employee e2=new Employee(26, "Ramya", 5.4);
		Employee e3=new Employee(36, "Soundarya", 5.0);
		Employee e4=new Employee(46, "Jaya", 5.5);
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);
		
		System.out.println("-----------Retrieve------------------");
		Iterator<Employee> i1=tr.iterator();
		while(i1.hasNext())
		{
			Employee s=i1.next();
			System.out.println("Name is"+s.name+"\n Id  :"+s.id+" \n Hieght : "+s.height);
		}
		
	}

}
