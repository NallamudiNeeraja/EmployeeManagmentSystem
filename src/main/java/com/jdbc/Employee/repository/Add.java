package com.jdbc.Employee.repository;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Add 
{
@Autowired
private JdbcTemplate template;
public void addEmp()
{
	Number id;
	String Name;
	long Mob;
	String email;
	Number salary;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee id");
	id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Employee Name");
	Name=sc.nextLine();
	System.out.println("Enter Employee Moblie Number");
	Mob=sc.nextLong();
	sc.nextLine();
	System.out.println("Enter Employee Email");
	email=sc.nextLine();
	System.out.println("Enter Employee salary");
     salary=sc.nextInt();
	sc.nextLine();
	String query="insert into Emps values(?,?,?,?,?)";
	int num=template.update(query,id,Name,Mob,email,salary);
	if(num==1)
	{
		System.out.println("Employee added sucessfully");
	}
	else
		System.out.println("operation terminated");
}

}
