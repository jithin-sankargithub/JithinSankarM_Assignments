package com.Arrayback;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListBack {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		System.out.println(values);
		System.out.println("Reverse order ");
		ListIterator<Integer> iterator = values.listIterator(values.size());
		
		while(iterator.hasPrevious())
		{
			System.out.print(iterator.previous()+" ");
		}

	}

}
