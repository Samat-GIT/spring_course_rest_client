package com.samat.spring.rest;

import com.samat.spring.rest.configuration.MyConfig;
import com.samat.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",
                Communication.class);

//        List<Employee> allEmployees =  communication.getAllEmployee();
//        System.out.println(allEmployees);

//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);

//        Employee emp = new Employee("Nina", "Nivovna", "IT", 700);
//        emp.setId(10);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(10);


    }
}
