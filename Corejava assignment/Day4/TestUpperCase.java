package assignement3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class TestUpperCase {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("haythem");
		list.add("kenway");
		list.add("arnold");
		list.add("harikrish");
		
		UnaryOperator <String> op = s -> s.toUpperCase();
		list.replaceAll(x -> op.apply(x));
		System.out.println(list);

	}

}
