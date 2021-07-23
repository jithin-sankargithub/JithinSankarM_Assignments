package com.springcoreassignment.q2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssignment2 {

	public static void main(String[] args) {
//		try(ClassPathXmlApplicationContext applicationcontext =  
//				new ClassPathXmlApplicationContext("questionListAssignment.xml")){
		try(ClassPathXmlApplicationContext applicationcontext =  
				new ClassPathXmlApplicationContext("questionSetAssignment.xml")){
//		try(ClassPathXmlApplicationContext applicationcontext =  
//				new ClassPathXmlApplicationContext("questionMapAssignment.xml")){
//		QuestionMap question = (QuestionMap) applicationcontext.getBean(QuestionMap.class);
//		QuestionList question = (QuestionList) applicationcontext.getBean(QuestionList.class);
		QuestionSet question = (QuestionSet) applicationcontext.getBean("question",QuestionSet.class);
		question.QandA_Display();

		
		
		}
		

	}

}
