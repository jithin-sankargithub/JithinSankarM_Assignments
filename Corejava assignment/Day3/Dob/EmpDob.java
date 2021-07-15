package com.company;

import java.util.HashMap;
import java.util.Map;

public class EmpDob {

	public static void main(String[] args) {
		
		Dob eDate1= new Dob(25,9,1997);
		Dob eDate2= new Dob(26,8,1998);
		Dob eDate3= new Dob(12,6,1996);
		Dob eDate4= new Dob(26,8,1987);
		
		Map<Dob,String> empdate = new HashMap<>();
		empdate.putIfAbsent(eDate1, "Rithwik");
		empdate.putIfAbsent(eDate2, "Ahmed");
		empdate.putIfAbsent(eDate3, "Manoj");
		empdate.putIfAbsent(eDate4, "Reenoj");
		System.out.println(empdate);
		System.out.println(empdate.get(eDate2));
		System.out.println(empdate.get(eDate4));
	}

}
