package com.capgemini.springs.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springs.annotations.beans.MessageBean;
import com.capgemini.springs.annotations.config.MessageConfig;

public class MessageTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		
		
		MessageBean messageBean = context.getBean(MessageBean.class);
		System.out.println("Message1."+messageBean.getMessage());
		
		MessageBean messageBean2 = context.getBean(MessageBean.class);
		System.out.println("Message2."+messageBean2.getMessage());
		
		//The proof of object created by Spring
		messageBean2.setMessage("It is new message for bean2");
		System.out.println("Message1: "+messageBean.getMessage());
		System.out.println("message2: "+messageBean2.getMessage());
	
	}
	

}
