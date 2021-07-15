package com.company;

import java.util.Hashtable;


public class Hashtabletest {

	public static void main(String[] args) {
		Hashtable<Employee,String> emp = new Hashtable<>();
		Employee e1=new Employee(101,"Mahesh",2500);
		Employee e2=new Employee(102,"Sumesh",5500);
		Employee e3=new Employee(989,"Ronald",4500);
		Employee e4=new Employee(210,"Kenway",2500);
		emp.put(e1,"MNA");
		emp.put(e2, "Arona");
		emp.put(e3, "Avion");
		emp.put(e4, "Amazon");
		System.out.println(emp.get(e1));
		System.out.println(emp.get(e4));
		System.out.println(emp.get(e3));
		System.out.println(emp);
		/*emp.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);
		});*/
	}

}
