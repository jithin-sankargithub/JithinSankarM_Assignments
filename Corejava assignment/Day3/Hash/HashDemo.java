package com.Hash;

import java.util.HashSet;
import java.util.Set;

public class HashDemo {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		values.add(9);
		values.add(98);
		values.add(78);
		values.add(65);
		for(int i : values) // HashSet unordered
		{
			System.out.println(i);
		}
		

	}

}
