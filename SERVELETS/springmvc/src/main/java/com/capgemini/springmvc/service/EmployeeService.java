package com.capgemini.springmvc.service;

import java.util.List;

import com.capgemini.springmvc.beans.EmployeeInfoBeans;

public interface EmployeeService {
	
	public EmployeeInfoBeans getEmployee(int empId);
	public EmployeeInfoBeans authenticate(int empId, String pwd);
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans);
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBeans> getAllEmployees();

} //End Of Interface
