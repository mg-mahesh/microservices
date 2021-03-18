package com.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class EmployeeInterceptorAppConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	private EmployeeInterceptor employeeInterceptor;

	public static final Logger logger = LoggerFactory.getLogger(EmployeeInterceptorAppConfig.class);
	
	 @Override
	   public void addInterceptors(InterceptorRegistry registry) {
		 registry.addInterceptor(employeeInterceptor);
		 logger.info("Employee Interceptor is rigistered with Interceptor Registry SUccessfully..!");
	 }

}
