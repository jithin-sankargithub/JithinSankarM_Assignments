package com.Hash;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashDemo1 {

	public static void main(String[] args) {
	Set<String> values = new LinkedHashSet<>();
	values.add("Hello");
	values.add("Iam");
	values.add("Ordered");
	values.add("LinkedHashSet");
	for(String i : values)
	{
		System.out.println(i);
	}

	}

}
