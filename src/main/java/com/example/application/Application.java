package com.example.application;

import com.example.application.config.ApplicationConfig;
import com.example.application.service.DepartmentService;
import com.example.application.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class); // 1
        DepartmentService departmentService = context.getBean(DepartmentService.class); // 2
        System.out.println(departmentService); // 3
        EmployeeService employeeService = context.getBean(EmployeeService.class); // 4
        System.out.println(employeeService.checkDepartment()); // 5
    }
}
