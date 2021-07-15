package com.assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OddLength {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Manoj");
		list.add("Alaska");
		list.add("Arrange");
		list.add("Antartica");
		list.add("Manifesto");
		list.add("Java");
		
		Predicate<String> predicate = t -> (t.length()%2!=0);
		list.removeIf(predicate);
		list.forEach(System.out::println);
		
		

	}

}
