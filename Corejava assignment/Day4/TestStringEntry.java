package assignement3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestStringEntry {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(101,"Haythem");
		map.put(102,"Kenway");
		map.put(112,"Arnold");
		map.put(123,"Christopher");
		map.put(134,"Manuel");
		
		Set<Entry<Integer,String>> entry = map.entrySet();
		StringBuilder strb =new StringBuilder();
		map.forEach((x,y) -> strb.append(x.toString()).append(y.toString()));
		System.out.println(strb);
		
		

	}

}
