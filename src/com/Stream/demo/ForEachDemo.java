package com.Stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Murrit");
		list.add("john");
		list.add("piter");
		list.add("marek");
		list.add("mac");

		list.stream().forEach(name -> System.out.println(name));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

		map.forEach((key, value) -> System.out.println(key + ": " + value));

		map.entrySet().stream().filter(key -> key.getKey() % 2 == 0).forEach(arg0 -> System.out.println(arg0));

		// FOREACH IMPLEMENTATION
		Consumer<String> consumer = (t) -> System.out.println(t);
		for (String s1 : list) {
			consumer.accept(s1);
		}

		list.stream().filter(name -> name.startsWith("M"))
				.forEach(nameStartingWithM -> System.out.println(nameStartingWithM));
		;

	}

}
