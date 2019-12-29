package com.capgemini.springs.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springs.annotations.beans.MessageBean;

@Configuration
public class MessageConfig {
	//Proof for object is created by spring is here we are not creating the object of this class object in test method .We are creating ap
	@Bean
	@Scope("prototype")
	//@Scope("singleton") to make singleton
	public MessageBean getMessageBean() {
		
		MessageBean messageBean =new MessageBean();
		messageBean.setMessage("Hello good morning");
		return messageBean;
	}
	
	

}
