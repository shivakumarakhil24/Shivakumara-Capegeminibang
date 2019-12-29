package com.capgemini.springrest.dao;

import java.util.List;

import com.capgemini.springrest.beans.EmployeeInfoBeans;

public interface EmployeeDAO {
	public EmployeeInfoBeans getEmployee(int empId);
	public EmployeeInfoBeans authenticate(int empId, String pwd);
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans);
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBeans> getAllEmployees();

	

}
