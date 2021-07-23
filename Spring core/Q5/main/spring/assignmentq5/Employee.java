package com.spring.assignmentq5;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private int employeeId;
	private String employeeName;
	@Resource
	private Pancard pancard;

	public int getEmployeeId() {
		return employeeId;
	}
	
    @Required
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}
    @Inject
	public void setEmployeeName(String employeeName) {
    	System.out.println("Inside setter");
		this.employeeName = employeeName;
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
	

}
