package com.capgemini.junit.junit_jupiter;

public class Factorial {
	public int fact(int a) {
		int sum=1;
		for(int i=1; i<=a;i++) {
			 sum=sum*i;
		}
		return sum;
	}

}
