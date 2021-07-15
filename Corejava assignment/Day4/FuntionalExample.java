package com.assignment4;
import java.util.*;
public class FuntionalExample {

	public static void main(String[] args) {
		List<Orders> list = new ArrayList<>();
		list.add(new Orders(25,"Hemanth",17000,"Completed"));
		list.add(new Orders(28,"Arjun",18000,"Rejected"));
		list.add(new Orders(36,"Akarsh",8000,"Completed"));
		list.add(new Orders(27,"Mahesh",21000,"Completed"));
		list.add(new Orders(18,"Raman",9000,"Accepted"));
		
		Priceable price = (a) -> {
			if(a.orderamount>10000 &&a.orderstatus.equals("Completed") || a.orderstatus.equals("Accepted"))
			 return true;
			 else {
				 return false;
			 }
		};
		for(Orders od : list)
		{
			if(price.contraint(od)) {
			System.out.println(od);
			}
		}
		

	}

}
interface Priceable{
	boolean contraint(Orders a);
	
}