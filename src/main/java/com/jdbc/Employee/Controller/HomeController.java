package com.jdbc.Employee.Controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.jdbc.Employee.repository.Add;
import com.jdbc.Employee.repository.Delete;
import com.jdbc.Employee.repository.Update;

public class HomeController 
{
	@Autowired
	private Add add;
	@Autowired
	private Delete del;
	@Autowired
	private Update update;
public void Controller()
{
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	while(flag)
	{
		System.out.println("Welcome to Employee Management System ");
		System.out.println("===============================");
		System.out.println("1:Add a New Employee");
		System.out.println("2:Update an Existing Employee");
		System.out.println("3:Delete an Employee");
		System.out.println("4:Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:add.addEmp();
			break;
		case 2:update.updateEmp();
			break;
		case 3:del.deleteEmp();
			break;
		case 4:
			System.out.println("Thanks For visiting your exicted");
			flag=false;
			break;
			default:
				System.out.println("Wrong Input");
	}
	
	}
}
}
