package assignment5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionTestStream {

	public static void main(String[] args) {
		List<Transaction> list = new ArrayList<>();
		list.add(new Transaction(new Trader("Raashmik","Indore"),2011,20000));
		list.add(new Transaction(new Trader("Manasa","Delhi"),2015,25000));
		list.add(new Transaction(new Trader("Hari","Pune"),2014,50000));
		list.add(new Transaction(new Trader("Potter","Mumbai"),2009,60000));
		list.add(new Transaction(new Trader("Herminine","Delhi"),2014,205000));
		list.add(new Transaction(new Trader("Weasly","Pune"),2008,40000));
		//Transaction in the year 2011 and sorted based on value in ascending
		List<Transaction> trans=list.stream().filter(c -> (c.getYear()==2011)).sorted(Comparator
				.comparingInt(Transaction::getValue)).collect(Collectors.toList());
		System.out.println(trans);
		//Traders from Delhi
		List<Transaction> trans1=list.stream().filter(c->c.getTrader().getCity().equals("Delhi"))
				.collect(Collectors.toList());
		System.out.println(trans1);
		//Transaction of highest value
		list.stream().max(Comparator.comparingInt(Transaction::getValue))
		.stream().map(x->x.getValue()).forEach(s->System.out.println(s));
		//Transaction of smallest value
		list.stream().min(Comparator.comparingInt(Transaction::getValue))
		.stream().forEach(s->System.out.println(s));

	}

}
