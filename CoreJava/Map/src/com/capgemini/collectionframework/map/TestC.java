package com.capgemini.collectionframework.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestC {
public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(2, "Mandya");
		hm.put(6, "Maddur");
		hm.put(8, "Malavalli");
		hm.put(9, "SrirangaPatna");
		hm.put(3, "Nagamanala");
		hm.put(5, "K R pete");
		
		Set<Integer> k=hm.keySet();
		System.out.println("all keys");
		for(Integer i:k)
		{
			
			System.out.println(i);
		}
		
		Collection<String> t=hm.values();
		System.out.println("all values");
		for(String o:t)
		{
			
			System.out.println(o);
		}
			
		
			
		}

}
