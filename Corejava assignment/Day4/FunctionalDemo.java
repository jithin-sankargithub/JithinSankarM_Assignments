package com.assignment4;
import java.util.*;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

abstract class FunctionalDemo {

	public static void main(String[] args) {
		//Predicate
		Predicate<Integer> predicate = (t) -> {
			if(t%2==0)
				return true;
			else
				return false;
			
		};
		System.out.println(predicate.test(10));
		
		//Supplier
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println(supplier.get());
		//Consumer
		Consumer<String> consumer = (t) -> System.out.println(t);
		consumer.accept("Manjusha");
		//Function
		Function<Integer,Double> function = t -> t/2.0;
		System.out.println(function.apply(10));

	}

}
