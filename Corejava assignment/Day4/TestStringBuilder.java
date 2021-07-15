package assignement3;

import java.util.ArrayList;
import java.util.List;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Haythem");
		list.add("Kenway");
		list.add("Steve");
		list.add("Manasa");
		list.add("Nishan");
		  
		StringBuilder strb = new StringBuilder();
		for(String i : list)
		{
			System.out.println(i);
			strb.append(i.charAt(0));
		}
		String newString = strb.toString();
		System.out.println(newString);

	}

}
