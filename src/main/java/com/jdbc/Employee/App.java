package com.jdbc.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdbc.Employee.Controller.HomeController;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container=new AnnotationConfigApplicationContext(JavaConfig.class);
       HomeController hc= container.getBean(HomeController.class);
       hc.Controller();
    }
}
