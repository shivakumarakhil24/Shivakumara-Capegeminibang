package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestAl2 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("priya");
		a.add(2);
		a.add('F');
		a.add(5.6);
		Iterator i1=a.iterator();
		for(Object oj:a)
		{
			
			System.out.println(oj);
		}
		
		
	}


}
