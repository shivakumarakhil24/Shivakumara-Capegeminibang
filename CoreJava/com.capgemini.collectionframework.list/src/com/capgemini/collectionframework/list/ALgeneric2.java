package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ALgeneric2 {
	public static void main(String[] args) {
		ArrayList<Double> a=new ArrayList<Double>();
		a.add(100.99);
		a.add(2.76);
		a.add(1997.90);
		a.add(2019.23);
		a.add(21.23);
		a.add(90.00);
		Iterator<Double> i1=a.iterator();
		System.out.println("--------retrieving using Iterator----------");
		while(i1.hasNext())
		{
			Double db=i1.next();
			System.out.println(db);
		}

}
	}
