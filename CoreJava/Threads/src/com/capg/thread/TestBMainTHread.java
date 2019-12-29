package com.capg.thread;

public class TestBMainTHread {
	public static void main(String[] args) {
		System.out.println("Main start");
		TestAThread tr=new TestAThread();
		tr.start();
		
		
		  try { 
			  tr.sleep(100); } catch (InterruptedException e)
		  { e.printStackTrace();
		  }
		  TestAThread t=new TestAThread();
			t.start();
		
		  System.out.println("Main Ended");
		
		
	}

}

