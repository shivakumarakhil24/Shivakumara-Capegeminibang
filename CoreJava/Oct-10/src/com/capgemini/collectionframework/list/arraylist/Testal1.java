package com.capgemini.collectionframework.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Testal1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('a');
		al.add('m');
		al.add('b');
		al.add('i');
		Collections.shuffle(al);
		System.out.println(al);
		
	}

}
