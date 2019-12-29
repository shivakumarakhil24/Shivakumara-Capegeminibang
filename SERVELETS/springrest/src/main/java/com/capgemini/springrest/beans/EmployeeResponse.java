package com.capgemini.springrest.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse {
	
private int statusCode;
private String message;
private String description;
private EmployeeInfoBeans  employeeInfoBeans;
private List<EmployeeInfoBeans> allEmployees;

//Getter and Setter

public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public EmployeeInfoBeans getEmployeeInfoBeans() {
	return employeeInfoBeans;
}
public void setEmployeeInfoBeans(EmployeeInfoBeans employeeInfoBeans) {
	this.employeeInfoBeans = employeeInfoBeans;
}
public List<EmployeeInfoBeans> getAllEmployees() {
	return allEmployees;
}
public void setAllEmployees(List<EmployeeInfoBeans> allEmployees) {
	this.allEmployees = allEmployees;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
