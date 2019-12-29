package com.capgemini.collectionframework.piority;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestMaxMin {
	public static void main(String[] args) {
		
		
		
	
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
	 	al.add(10);
		al.add(6);
		al.add(3);
		al.add(4);
		Comparator<Integer> comp= (i,j) -> i.compareTo(j);
		Integer small=al.stream().min(comp).get();
		System.out.println(small);
		
		Integer large=al.stream().max(comp).get();
		System.out.println(large);
		
		
		
		
	}
}
