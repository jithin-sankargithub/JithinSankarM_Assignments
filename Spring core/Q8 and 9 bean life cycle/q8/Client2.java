package com.springcore.springassignments.q8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationcontext= new ClassPathXmlApplicationContext("beanlifecycle2.xml")){
			Student student =applicationcontext.getBean(Student.class);
			System.out.println("Student id: "+student.getStudentId()+
					"\t Student name: "+student.getStudentName());
		}

	}

}
