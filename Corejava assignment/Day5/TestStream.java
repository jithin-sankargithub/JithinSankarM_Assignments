package assignment5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TestStream {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("mango",120,80,"Yellow"));
		list.add(new Fruit("apple",110,100,"Red"));
		list.add(new Fruit("pineapple",90,50,"Yellow"));
		list.add(new Fruit("orange",80,70,"Orange"));
		list.add(new Fruit("peach",130,75,"Red"));
		//Calories less than 100
		list.stream().filter(x -> x.calories<100).sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
		 .forEach(n->System.out.println(n.getName()));
		//Red color fruits sorted
		list.stream().filter(m->m.getColor()=="Red")
		.sorted(Comparator.comparingInt(Fruit::getPrice))
		//List by color
		.forEach(x->System.out.print(x));
		list.stream().sorted(Comparator.comparing(Fruit::getColor))
				.forEach(n ->System.out.print(n.getName()+" "+n.getColor()+"\n"));

	}

}
