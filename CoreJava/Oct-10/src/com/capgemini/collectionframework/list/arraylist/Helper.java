package com.capgemini.collectionframework.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Helper {
	
	
	public void rec(ArrayList<Student> al)
	{
		//Retrieving-------------------
				System.err.println("==-----------Using ForEach-------------==");
				for(Student st:al)
				{
					System.out.println(" Sudent ID is "+st.id+" and Name  is  "+st.name+" Studying in  "+st.college+"College of Engg");
				}
				System.out.println();
				System.out.println();
				
				
				
				System.err.println("=--------------Using normal for----------=====");
				for(int i=0;i<al.size();i++)
				{
					Student sf=al.get(i);
					System.out.println(" Sudent ID is "+sf.id+" and Name  is  "+sf.name+" Studying in  "+sf.college+"College of Engg");
					
				}
				System.out.println();
				System.out.println();
				
				
				System.err.println("--------Using Iterator----------------");
				Iterator<Student> i1=al.iterator();
				while(i1.hasNext())
				{
					Student si=i1.next();
					System.out.println(" Sudent ID is "+si.id+" and Name  is  "+si.name+" Studying in  "+si.college+"College of Engg");
					
				}
				System.out.println();
				System.out.println();
				System.err.println("------------------Using ListIterator---------");
				
				ListIterator<Student> d=al.listIterator();
				System.err.println("===================Forword=====================");
				while(d.hasNext())
				{
					Student si=d.next();
					System.out.println(" Sudent ID is "+si.id+" and Name  is  "+si.name+" Studying in  "+si.college +"College of Engg");
						
				}
				System.out.println();
				System.out.println();
				System.err.println("<<<<<<<<<<<<<<<<<<Back backward<<<<<<<<<<<<<<<<<<<");
				
			
				while(d.hasPrevious())
					
				{
					Student si=d.previous();
					System.out.println(" Sudent ID is "+si.id+" and Name  is  "+si.name+" Studying in  "+si.college+"College of Engg");
						
				} }
				
					
				
			}

	


