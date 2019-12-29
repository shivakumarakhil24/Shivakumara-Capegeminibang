package com.capgemini.springs.beans;

import java.lang.reflect.Constructor;

public class MessageBean2 {
	public MessageBean2() {
		System.out.println("It constructor of MeassageBean2.... ");
	}
	String message;

	// Getter and Setter
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("Its init phase");
	}

	public void destroy() {
		System.out.println("its Destroy phase");
	}

}
