package com.capgemini.springs.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springs.annotations.beans.EmployeeBean;
import com.capgemini.springs.annotations.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		System.out.println("-------------Student Info----------");
		System.out.println("EmpId : " + employeeBean.getEmpId());
		System.out.println("EmpName : " + employeeBean.getEmpName());
		System.out.println("------------Dept Info----------");
		System.out.println("DeptName : " + employeeBean.getDepartmentBean().getDeptName());
		System.out.println("DeptID   :" + employeeBean.getDepartmentBean().getDeptId());

		((AbstractApplicationContext) context).close();
	}

}
