package com.jdbc.Employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbc.Employee.Controller.HomeController;
import com.jdbc.Employee.repository.Add;
import com.jdbc.Employee.repository.Delete;
import com.jdbc.Employee.repository.Update;

@Configuration
public class JavaConfig 
{
@Bean
public DriverManagerDataSource dmbs()
{
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
	ds.setUsername("system");
	ds.setPassword("12345");
	return ds;
}
@Bean
public JdbcTemplate jdbc()
{
	JdbcTemplate js=new JdbcTemplate();
	js.setDataSource(dmbs());
	return js;
}
@Bean
public Add add()
{
	Add add=new Add();
	return add;
}
@Bean
public Delete del()
{
	Delete del=new Delete();
	return del;
}
@Bean
public Update update()
{
    Update u=new Update();
	return u;
}
@Bean
public HomeController controller()
{
	HomeController ct=new HomeController();
	return ct;
}

}

