package com.jspiders.capgemini.exceptionB;

public class InvalidLimitException extends Exception
{
String mes="You Already cross the LIMIT 40000";
@Override
	public String toString() {
		
		return mes;
	}
}
