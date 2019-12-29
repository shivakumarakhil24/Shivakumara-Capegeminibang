package com.capgemini.collectionframework.list.arraylist;

import java.util.ArrayList;

public class ALDouble {
	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(3.6);
		al.add(2.4);
		al.add(4.7);
		al.add(1.6);
		System.out.println("-------Before-------"+al);
		
		al.add(5.6);
		al.add(2,1.1);
		System.out.println("------After---------"+al);
		
		
	}

}
