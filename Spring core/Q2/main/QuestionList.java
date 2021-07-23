package com.springcoreassignment.q2;

import java.util.List;

public class QuestionList {
	private int questionId;
	private String question;
	private List<String> answers;
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
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public QuestionList(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	
	public QuestionList() {
		super();
		
	}
	public List<String> QandA_Display() {
		System.out.println("QuestionId: "+questionId);
		System.out.println("Question: "+question);
		System.out.println("Answers: "+answers);
		return answers;
	}

}
