package com.priyanshu.main;

import com.priyanshu.dao.EmployeeDaoImp;
import com.priyanshu.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.priyanshu")
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext container = SpringApplication.run(SpringJdbcApplication.class, args);

		EmployeeDaoImp employeeDaoImp = container.getBean(EmployeeDaoImp.class);
		employeeDaoImp.getEmployeeInfo().forEach(employee -> System.out.println(employee));
	}

}
