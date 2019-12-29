package com.capgemini.springs.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//To perform Spring Life cycle....
//1.Initialization - By implementing the IntializableBean and DisposableBean interface

public class MessageBean implements InitializingBean, DisposableBean {
	String message;// this name should be same as name="" in property tag

// Getter and Setter
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");

	}

}
