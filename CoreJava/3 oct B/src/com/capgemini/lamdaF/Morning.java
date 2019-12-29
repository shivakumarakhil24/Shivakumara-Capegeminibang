package com.capgemini.lamdaF;

public interface Morning {
	void disp();
	

}
class Morn
{
	public static void main(String[] args) 
	{
	Morning m=()->System.out.println("mornig");	
	m.disp();
	}
}
