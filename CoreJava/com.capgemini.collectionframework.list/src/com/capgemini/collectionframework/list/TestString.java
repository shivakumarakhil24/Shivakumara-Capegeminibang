package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestString {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Amma");
		a.add("Appaji");
		a.add("Sunday");
		a.add("Monday");
		a.add("Tuesday");
		a.add("Wednessday");
		Iterator<String> i1=a.iterator();
		System.out.println("--------retrieving using Iterator----------");
		while(i1.hasNext())
		{
			String db=i1.next();
			System.out.println(db);
		}
		ListIterator<String> lt=a.listIterator();
		System.out.println("--------retrieving using List Iterator----------");
		while(lt.hasNext())
		{
			String db=lt.next();
			System.out.println(db);
		}
	}
}
