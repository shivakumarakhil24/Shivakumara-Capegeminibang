package com.capg.thread;

public class TestA1 {
public static void main(String[] args) {
	System.out.println("main started ");
	A1Pvr ap=new A1Pvr();
	A2PayTm pt=new A2PayTm(ap);
	pt.start();
	
	A2PayTm pt2=new A2PayTm(ap);
	pt2.start();
	//ap.leaveme();
	
	System.out.println("Main ended");
	
} 

}
