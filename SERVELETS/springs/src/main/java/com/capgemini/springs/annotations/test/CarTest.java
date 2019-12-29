package com.capgemini.springs.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springs.annotations.beans.Car;

public class CarTest {
	
	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("carConfig.xml");
	   Car mycar= context.getBean("myCar",Car.class);
	    
	    System.out.println("Model num: "+ mycar.getModelName());
	    System.out.println("Model name: "+ mycar.getModelNum());
	    System.out.println("Engine details--------------------");
	    System.out.println("CC"+mycar.getEngine().getCC());
	    System.out.println("Type "+mycar.getEngine().getType());
	
	
	
	}
	
	

}
