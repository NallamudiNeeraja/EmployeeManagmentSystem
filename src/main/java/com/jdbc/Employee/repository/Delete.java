package com.jdbc.Employee.repository;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Delete 
{
	@Autowired
	private JdbcTemplate template;
	
	public void deleteEmp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee you want to delete?");
		int id=sc.nextInt();
		String query="delete from Emps where id=?";
		int num=template.update(query,id);
		if(num==1)
		{
			System.out.println("Employee Delete sucessufuly");
		}
		else
		{
			System.out.println("Operation Termited");
		}
	}
}
