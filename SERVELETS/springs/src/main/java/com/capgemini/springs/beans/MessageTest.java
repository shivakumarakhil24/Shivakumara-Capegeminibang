package com.capgemini.springs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {
	public static void main(String[] args) {
		//beans.xml is xml file what we are created ...In which it start the searching...

		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		//messageBean is the id name what we given in the id="" inside the bean tag...
		
	((AbstractApplicationContext)context).registerShutdownHook();
		MessageBean messageBean =(MessageBean) context.getBean("messageBean");
		System.out.println(messageBean.getMessage());
		
		((AbstractApplicationContext)context).close();
		//At a time we can use only either of one , means close() or registerShutDownHook
	}//main

}//class
