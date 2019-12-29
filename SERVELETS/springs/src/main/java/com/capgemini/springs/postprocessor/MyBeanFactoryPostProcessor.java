package com.capgemini.springs.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    System.out.println("Inside my bean factory Post Porocessor");
    BeanDefinition beanDefinition = beanFactory.getBeanDefinition("messageBean2");
    MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
    //To proove object is controlled by Spring
    System.out.println("message via xml"+propertyValues.getPropertyValue("message").getValue());
    
    propertyValues.addPropertyValue("message", "Welcome to Spring-5.....!!!");
	}
	

}
