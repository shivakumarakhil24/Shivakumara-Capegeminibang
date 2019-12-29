package com.jspiders.capgemini.exceptionB;

public class InvalidAgeException extends RuntimeException {
	String str="Invalid age  to proceed";
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}

}
