package com.capgemini.springs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MesssageTest2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		MessageBean2 messageBean2= context.getBean("messageBean2", MessageBean2.class);
		System.out.println("Message : "+messageBean2.getMessage());
		
		/*
		 * MessageBean2 bean2= context.getBean("messageBean2", MessageBean2.class);
		 * System.out.println("Message : "+bean2.getMessage());
		 */
		
		
		((AbstractApplicationContext)context).close();
	}

}
