package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestVector2 {
public static void main(String[] args) {
	Vector<Character> v=new Vector<Character>();
	v.add('A');
	v.add('M');
	v.add('B');
	v.add('A');
	
	
	
	System.out.println("---------Using foreach--------");
	for(Character cr:v)
	{
		System.out.println(cr);
	}
	
	
	System.out.println("--------using General for---------");
	for (int i = 0; i < v.size(); i++) 
	{
		Character c=v.get(i);
		System.out.println(c);
	}

	System.out.println("----------using Iterator");
	Iterator<Character> i1=v.iterator();
	while(i1.hasNext())
	{
		Character c=i1.next();
		System.out.println(c);
	}
	
	
	
	System.out.println("--------using List Iterator---------");
	ListIterator<Character> lt=v.listIterator();
	System.out.println("--------Forword List Iterator---------");
	while(lt.hasNext())
	{
		Character ch= lt.next();
		System.out.println(ch);
	}
	
	
	
	System.out.println("--------Backward List Iterator---------");
	while(lt.hasPrevious())
	{
		Character ch=lt.previous();
		System.out.println(ch);
	}
	
	
}
}
