package com.jdbc.Employee.repository;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Update 
{

	@Autowired
	private JdbcTemplate template;
	
	public void updateEmp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the emp Id you want to update?");
		int id=sc.nextInt();
		sc.nextLine();
		boolean flag=true;
		while(flag)
		{
			System.out.println("Choose the filed u want to update");
		
			System.out.println("1:Name");
			System.out.println("2:Mob");
			System.out.println("3.Email");
			System.out.println("4.salary");
			System.out.println("5.Exit the update Menu");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter your Name");
				sc.nextLine();
				String Name=sc.nextLine();
				String query="update Emps set name=? where id=?";
				int num=template.update(query,Name,id);
				if(num==1)
				{
					System.out.println("Name updated sucessufully");
				}
				else {
					System.out.println("operation terminated");
				}
			}
			else if(choice==2)
			{
				System.out.println("Enter your Moblie Number");
				sc.nextLine();
				Long Mob=sc.nextLong();
				String query="update Emps set Mob=? where id=?";
				int num=template.update(query,Mob,id);
				if(num==1)
				{
					System.out.println("Moblie Number updated sucessufully");
				}
				else {
					System.out.println("operation terminated");
				}
			}
			else if(choice==3)
			{
				System.out.println("Enter your Email");
				sc.nextLine();
				String Email=sc.nextLine();
				String query="update Emps set Email=? where id=?";
				int num=template.update(query,Email,id);
				if(num==1)
				{
					System.out.println("Email updated sucessufully");
				}
				else {
					System.out.println("operation terminated");
				}
			}
			else if(choice==4)
			{
				System.out.println("Enter your salary");
				int salary=sc.nextInt();
				String query="update Emps set salary=? where id=?";
				int num=template.update(query,salary,id);
				if(num==1)
				{
					System.out.println("salary updated sucessufully");
				}
				else {
					System.out.println("operation terminated");
				}
			}
			else if(choice==5)
			{
				flag=false;
			}
			else
			{
				System.out.println("Wrong Input");
			}
		}
	}
}
