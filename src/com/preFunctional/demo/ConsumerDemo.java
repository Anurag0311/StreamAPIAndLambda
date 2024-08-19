package com.preFunctional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
//		Consumer<Integer> consumer = arg0 -> System.out.println(arg0);
//		consumer.accept(10);

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().forEach(arg0 -> System.out.println(arg0));
	}

}
