package com.springcoreassignment.q2;

import java.util.Set;

public class QuestionSet {
	private int questionId;
	private String question;
	private Set<String> answers;
	
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
	public Set<String> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	
	public Set<String> QandA_Display() {
		System.out.println("QuestionId: "+questionId);
		System.out.println("Question: "+question);
		System.out.println("Answers: "+answers);
		return answers;
	}

}
