package com.capg.thread;

public class A2PayTm extends Thread{
	A1Pvr ref;
	public A2PayTm(A1Pvr r) {
		ref=r;
		
	} 
	@Override
	public void run() {
		
		ref.confirm();
	}

}
