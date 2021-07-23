package com.springcore.springassignments.q8;

public class Student {
	private int studentId;
	private String studentName;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void init() throws Exception{
		System.out.println("Bean is in the initialization stage");
	}
	public void destroy() throws  Exception{
		System.out.println("Bean is  being destroyed");
	}
	
//	@PostConstruct
//	public void postConstruct() {
//		System.out.println("Initialization stage");
		
//	}
//	@PreDestroy
//	public void preDestroy() {
//		System.out.println("Destroying of bean");
//	}

}
