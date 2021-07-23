package com.spring.assignmentq5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client5 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment5.xml");
		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
		System.out.println(employee.getPancard().getPanHolderName()+"\t" +employee.getPancard().getPanNo());
		((AbstractApplicationContext)context).close();

	}

}
