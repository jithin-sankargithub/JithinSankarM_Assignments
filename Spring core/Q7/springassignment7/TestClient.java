package com.springassignment7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springassignment7/Springexpression.xml")){
			SpringExpDemo demo =context.getBean(SpringExpDemo.class);
			System.out.println(demo);
		
		}
	}

}
