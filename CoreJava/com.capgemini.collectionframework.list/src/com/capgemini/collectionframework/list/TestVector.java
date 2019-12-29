package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestVector {
public static void main(String[] args) {
		
		
		Vector al=new Vector();
		al.add(24);
		al.add("Anu");
		al.add(false);
		al.add(2.1);
		al.add('S');
		Iterator i1=al.iterator();
		System.out.println("--------retrieving using Iterator----------");
		while(i1.hasNext())
		{
			Object o=i1.next();
			System.out.println(o);
		}
		ListIterator lt=al.listIterator();
		System.out.println("---------using List Iterator---------");
		System.out.println("---------Forword");
		while(lt.hasNext())
		{
			Object r=lt.next();
			System.out.println(r);
			
		}
		System.out.println("------------Backward");
		while(lt.hasPrevious())
		{
			Object r=lt.previous();
			System.out.println(r);
			
		}
		System.out.println("--------for each");
		for(Object oj:al)
		{
			
			System.out.println(oj);
		}
		
		System.out.println("----------using-----forloop");
		for(int k=0;k<al.size();k++)
		{
			Object oj=al.get(k);
			System.out.println(oj);
		}
}
}
