package com.capgemini.springs.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.capgemini.springs.annotations.beans.DepartmentBean;
import com.capgemini.springs.annotations.beans.EmployeeBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig {

    @Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123);
		employeeBean.setEmpName("Anirrudh");
		return employeeBean;
	}

	
	//Department objects
	/*
	 * @Bean(name="auto") public DepartmentBean getdeDepartmentBean() {
	 * DepartmentBean departmentBean = new DepartmentBean();
	 * departmentBean.setDeptId(420); departmentBean.setDeptName("AutoMata");
	 * 
	 * return departmentBean; }
	 * 
	 * @Bean(name="dev") //@Primary //to executing purticuler method
	 * 
	 * public DepartmentBean getDevlop() { DepartmentBean departmentBean2 = new
	 * DepartmentBean(); departmentBean2.setDeptId(100);
	 * departmentBean2.setDeptName("Devlop");
	 * 
	 * return departmentBean2; }
	 * 
	 * @Bean(name="test") public DepartmentBean getTesting() { DepartmentBean
	 * departmentBean3 = new DepartmentBean(); departmentBean3.setDeptId(150);
	 * departmentBean3.setDeptName("Testing");
	 * 
	 * return departmentBean3; }
	 */
//copied to deptConfigClass...
}
