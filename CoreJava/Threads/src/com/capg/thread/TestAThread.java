package com.capg.thread;

public class TestAThread extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i <3; i++)
		{
			System.out.println("Shivu");
		}
		
		for (int j = 0; j <3; j++)
		{
		System.out.println("Kumar");	
		}
		
		
	}

}
