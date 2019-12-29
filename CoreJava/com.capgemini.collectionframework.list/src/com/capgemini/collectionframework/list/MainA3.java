package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MainA3 {
	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();

		al.add(24);
		al.add("MAR");
		al.add(true);
		al.add(19.97);
		al.add('S');
		Iterator i1=al.iterator();
	
		while(i1.hasNext())
		{
			Object r=i1.next();
			System.out.println(r);
			
		}

}
}
