package com.capgemini.springs.beans;

public class EmployeeBean {
	private int empId;
	private String empName;
	private DepartmentBean deptBean;
	
	//All arg constructor
	public EmployeeBean(int empId, String empName, DepartmentBean deptBean) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptBean = deptBean;
	}
	//Getter and setter
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public DepartmentBean getDeptBean() {
		return deptBean;
	}
	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}

}