package com.capgemini.springs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeBean employeeBean = (EmployeeBean) context.getBean("employee");
	EmployeeBean employeeBean2 = context.getBean("employee2", EmployeeBean.class);
	
	System.out.println("Employee Id :"+ employeeBean.getEmpId());
	System.out.println("EMployee name: "+ employeeBean.getEmpName());
	System.out.println("********************************");
	
	System.out.println("Employee Id :"+ employeeBean2.getEmpId());
	System.out.println("EMployee name: "+ employeeBean2.getEmpName());
	}

}
