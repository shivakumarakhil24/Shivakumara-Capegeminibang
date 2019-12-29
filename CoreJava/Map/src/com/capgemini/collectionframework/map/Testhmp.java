package com.capgemini.collectionframework.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Testhmp {
public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(2, "Mandya");
		hm.put(6, "Maddur");
		hm.put(8, "Malavalli");
		hm.put(9, "SrirangaPatna");
		hm.put(3, "Nagamanala");
		hm.put(5, "K R pete");
		
		for(Map.Entry<Integer, String > r:hm.entrySet())
		{
			Integer k=r.getKey();
			String t=r.getValue();
			System.out.println("Key "+k);
			System.out.println("Value  "+t);
			
		}
		
}
}
