package com.capgemini.collectionframework.list.sort;

import java.util.HashSet;

public class GenericHS {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(10.38);
		hs.add("Shiva");
		hs.add(null);
		hs.add(null);
		hs.add(true);
		hs.add(10);
		
		for(Object a:hs)
		{
			System.out.println(a);
		}
		
	}

}
