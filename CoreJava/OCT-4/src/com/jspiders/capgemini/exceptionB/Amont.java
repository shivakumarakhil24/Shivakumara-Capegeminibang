package com.jspiders.capgemini.exceptionB;

public class Amont {
	void Amount(int rs) throws Exception
	{
	if(rs>40000)
	{
		throw new InvalidLimitException();
	}
	System.out.println("COLLECT Cash");
	
	}

}
