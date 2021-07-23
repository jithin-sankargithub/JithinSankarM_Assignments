package com.springcoreassignment.q2;

import java.util.Map;

public class QuestionMap {
	private int questionId;
	private String question;
	private Map<Integer,String> answers;
	
	
	public int getQuestionId() {
		return questionId;
	}


	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public Map<Integer, String> getAnswers() {
		return answers;
	}


	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}


	public Map<Integer,String> QandA_Display() {
		System.out.println("QuestionId: "+questionId);
		System.out.println("Question: "+question);
		System.out.println("Answers: "+answers);
		return answers;
	}

}
