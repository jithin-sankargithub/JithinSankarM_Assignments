package com.person;

import java.util.Set;
import java.util.TreeSet;



public class TreesetTest {

	public static void main(String[] args) {
		Set<Person> stud = new TreeSet<>();
		Person p1=new Person(45,156,"Arunan");
		Person p2=new Person(54,134,"Jiju");
		Person p3=new Person(45,158,"Ryan");
		Person p4=new Person(78,189,"Nishan");
		Person p5=new Person(78,178,"Rithan");
		stud.add(p1);
		stud.add(p2);
		stud.add(p3);
		stud.add(p4);
		stud.add(p5);

	  
	System.out.println(stud);
	}

	}


