package com.stream.api;

import java.io.ObjectInputStream.GetField;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainStreameApi {
	public static void main(String[] args) {
		StremeDao dao = new StremeDao();
		List<Fruit> fruits = dao.findAllFruit();

//		Consumer<Fruit> c = (e) -> System.out.println(e);
//		fruits.forEach(c);
		Comparator<Fruit> f = (c2,c1) ->{
			int result = Double.compare(c2.getCalories(),c1.getCalories());
			System.out.println(result);
			return result;
		};
		
		
		                                            
		                                             
		
	}
//		fruits.stream()
//        .skip(2)
//        .limit(3)
//        .forEach(f -> System.out.println(f));
//
//	
//	}
}
	


