package com.capgemini.collectionframework.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper2 {
	public void passFail(ArrayList<Student> s)
	{
		Iterator<Student> i2=s.iterator();
		while(i2.hasNext())
		{
			Student d=i2.next();
			if(d.id>75 )
			{
				System.err.println("Distinction Student");
				System.out.println(" Sudent ID is "+d.id+" and Name  is  "+d.name+" Studying in  "+d.college+"College of Engg");
			}
			else if(d.id>35 && d.id<75) 
			{
				System.err.println("passed students");
				System.out.println(" Sudent ID is "+d.id+" and Name  is  "+d.name+" Studying in  "+d.college+"College of Engg");
			}
			
		     
		
	} }
}
