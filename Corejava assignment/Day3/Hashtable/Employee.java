package com.company;

import java.util.Objects;

public class Employee {
      int emp_id;
      String name;
      int Salary;
	public Employee(int emp_id, String name, int salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		Salary = salary;
	}
	@Override
	public int hashCode() {
		return 123;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
      
}
