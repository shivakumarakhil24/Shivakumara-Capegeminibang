package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class Alist {
	public static void main(String[] args) {
		
	
	ArrayList al=new ArrayList();
	System.out.println(al);
	al.add(24);
	al.add("Anu");
	al.add(false);
	al.add(2.1);
	al.add('S');
	System.out.println(al);
	for (int i = 0; i < al.size(); i++)
	{
		Object r=al.get(i);
		System.out.println(r);
	}
	
	}

}
