package assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTrader {

	public static void main(String[] args) {
		List<Trader> list = new ArrayList<>();
		list.add(new Trader("Arjun","Indore"));
		list.add(new Trader("Raman","Pune"));
		list.add(new Trader("Alog","Delhi"));
		list.add(new Trader("Amir","Pune"));
		list.add(new Trader("Manoj","Pune"));
		list.add(new Trader("Rashik","Delhi"));
		list.add(new Trader("Vishnu","Mumbai"));
		//Distinct cities the traders work
	     Set distinct=list.stream().collect(Collectors.groupingBy(Trader::getCity,Collectors.counting())).keySet();
	     System.out.println(distinct);
	     //Traders from pune
	     List str=list.stream().filter(s -> s.city.equals("Pune")).map(Trader::getName).sorted()
	     .collect(Collectors.toList());
	     System.out.println(str);
	     List str1=list.stream().map(Trader::getName).sorted().collect(Collectors.toList());
	     System.out.println(str1);
	     //Traders based on indore
	     Optional<Trader> str2=list.stream().filter(s->s.city.equals("Indore")).findAny();
	     System.out.println(str2);
	}

}
