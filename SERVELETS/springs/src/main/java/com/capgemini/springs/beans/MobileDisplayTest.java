package com.capgemini.springs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDisplayTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobileConfig.xml");
		Mobile mobile = context.getBean("mobile", Mobile.class);

		System.out.println("Brand Name      : " + mobile.getBrandName());
		System.out.println("Model Name      : " + mobile.getModelName());
		System.out.println("Price           : " + mobile.getPrice());
		System.out.println("Display size    : " + mobile.getmDisplay().getDiplaySize());
		System.out.println("Display Resolution: " + mobile.getmDisplay().getResolution());
	}// main

}// Class
