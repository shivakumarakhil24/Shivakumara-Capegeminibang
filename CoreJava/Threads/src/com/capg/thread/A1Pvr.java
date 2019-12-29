package com.capg.thread;

public class A1Pvr {

 synchronized	void confirm() {
		for (int i = 0; i <5; i++) {
			System.out.println(i+"Hello im PVR");
			
			try 
			{
				wait(100);
				//Thread.sleep(10);
		     } 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	} }
 
	/*
	 * synchronized void leaveme() { System.out.println("notify called"); notify();
	 * }
	 */}
