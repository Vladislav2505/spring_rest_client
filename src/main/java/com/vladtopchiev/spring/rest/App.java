package com.vladtopchiev.spring.rest;

import com.vladtopchiev.spring.rest.configuration.MyConfig;
import com.vladtopchiev.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean(Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//
//        for(Employee emp : allEmployees){
//            System.out.println(emp);
//        }

//        Employee employee = communication.getEmployee(12);
//        System.out.println(employee);

        communication.deleteEmployee(12);
    }
}
