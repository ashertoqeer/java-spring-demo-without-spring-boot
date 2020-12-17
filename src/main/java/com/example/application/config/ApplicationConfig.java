package com.example.application.config;

import com.example.application.service.DepartmentService;
import com.example.application.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public DepartmentService departmentService() {
        return new DepartmentService();
    }

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService(departmentService());
    }
}
