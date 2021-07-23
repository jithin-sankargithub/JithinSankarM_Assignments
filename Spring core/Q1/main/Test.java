package com.thespringcoreassignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationcontext= new ClassPathXmlApplicationContext("Beans1.xml")){
			Customer customer = applicationcontext.getBean(Customer.class);
			customer.Display();
		}

	}

}
