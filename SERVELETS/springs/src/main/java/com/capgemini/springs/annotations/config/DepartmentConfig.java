package com.capgemini.springs.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springs.annotations.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {
	@Bean(name = "auto")
	public DepartmentBean getdeDepartmentBean() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(420);
		departmentBean.setDeptName("AutoMata");

		return departmentBean;
	}

	@Bean(name = "dev")
	// @Primary //to executing purticuler method

	public DepartmentBean getDevlop() {
		DepartmentBean departmentBean2 = new DepartmentBean();
		departmentBean2.setDeptId(100);
		departmentBean2.setDeptName("Devlop");

		return departmentBean2;
	}

	@Bean(name = "test")
	public DepartmentBean getTesting() {
		DepartmentBean departmentBean3 = new DepartmentBean();
		departmentBean3.setDeptId(150);
		departmentBean3.setDeptName("Testing");

		return departmentBean3;
	}

}
