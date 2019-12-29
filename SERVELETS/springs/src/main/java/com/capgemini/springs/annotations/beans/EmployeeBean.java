package com.capgemini.springs.annotations.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {

	private String empName;
	private int empId;
	@Autowired(required = false)
	@Qualifier("auto")
	private DepartmentBean departmentBean;

//Getter and Setter

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	// Life-Cycle
	@PostConstruct
	public void init() {
		System.out.println("Init Phase...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("\n\n Object isDestroyed...");
	}

}
