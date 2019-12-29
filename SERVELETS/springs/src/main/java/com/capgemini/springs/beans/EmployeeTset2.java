package com.capgemini.springs.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTset2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		
		EmployeeBean emp1 = context.getBean("employee", EmployeeBean.class);
		
		System.out.println("Enter the Id");
		int empId= sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		
		emp1.setEmpId(empId);
		emp1.setEmpName(name);
		
       EmployeeBean emp2 = context.getBean("employee", EmployeeBean.class);
		
		System.out.println("Enter the Id");
		int empId2= sc.nextInt();
		System.out.println("Enter the name");
		String name2=sc.next();
		
		emp2.setEmpId(empId2);
		emp2.setEmpName(name2);
		
		System.out.println("EMp1 Id:" + emp1.getEmpId());
		System.out.println("EMp1 Name" + emp1.getEmpName());
		System.out.println("EMp2 Id:" + emp2.getEmpId());
		System.out.println("EMp2 Name" + emp2.getEmpName());
		
		
		
		

		
		
	}

}
