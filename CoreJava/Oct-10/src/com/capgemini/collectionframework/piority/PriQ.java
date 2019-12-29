package com.capgemini.collectionframework.piority;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriQ {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(100);
		pq.add(20);
		pq.add(190);
		pq.add(40);
		pq.add(30);
		
		
		Iterator i1=pq.iterator();
		while(i1.hasNext())
		{
			
			System.out.println(i1.next());
			
		}
		
		
		
	}

}
