package com.capgemini.springs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDepartmentTest {
	public static void main(String[] args) {
		// ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig2.xml" , "departmentConfig.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig2.xml");
		EmployeeBean employeeBean = context.getBean("employee", EmployeeBean.class);

		System.out.println("Employee Id:     " + employeeBean.getEmpId());
		System.out.println("Employee Name:   " + employeeBean.getEmpName());
		System.out.println("Department Id:   " + employeeBean.getDeptBean().getDeptId());
		System.out.println("Deaprtment Name: " + employeeBean.getDeptBean().getDeptName());

	}// End Main

}// End Class
