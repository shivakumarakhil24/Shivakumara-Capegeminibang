package com.capgemini.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class EmployeeConfig {
	@Bean
	public LocalEntityManagerFactoryBean getEmf() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("Shiva");
		return factoryBean;

	}// Getemf

}// End of Class
