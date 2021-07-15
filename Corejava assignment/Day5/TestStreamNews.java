package assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class TestStreamNews {

	public static void main(String[] args) {
		List<News> list = new ArrayList<>();
		list.add(new News(101,"Haythem","Kenway","The budget details"));
		list.add(new News(121,"Manu","Rithwik","The details is unknown"));
		list.add(new News(121,"Hari","Kenway","The budget is estimated"));
		list.add(new News(101,"Haythem","Akarsh","Rocks"));
		list.add(new News(101,"Ronald","Manyu","the year budget"));
		list.add(new News(154,"Haythem","Kenway","Mostly unwanted"));
		//count the number of budgets in comment
		long count1 = list.stream().filter(s -> s.getComment().contains("budget")).count();
		System.out.println(count1);
		// Newsid with most comments
		Integer com = list.stream().collect(Collectors.groupingBy(News::getNewsid,Collectors.counting()))
				         .entrySet().stream().max(Map.Entry.comparingByValue())
				         .get().getKey();
		System.out.println(com);
		//User who commented the most
		String com1 = list.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()))
				           .entrySet().stream().max(Map.Entry.comparingByValue())
				           .get().getKey();
		System.out.println(com1);
		// Comment by user
		Map com2 = list.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
				System.out.println(com2);
		
	}

}
