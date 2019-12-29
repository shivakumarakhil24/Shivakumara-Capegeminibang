package com.capgemini.collectionframework.set;

import java.util.HashSet;

public class TestA {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add("String");
		hs.add(true);
		hs.add(null);
		hs.add(12);
		for(Object a:hs)
		{
		
		System.out.println(a);	
		
		}
		
		
		
		
	}

}
