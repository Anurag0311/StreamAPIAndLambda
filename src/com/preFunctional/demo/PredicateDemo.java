package com.preFunctional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
//		Predicate<Integer> predicate = args0 -> args0 % 2 == 0;
//		System.out.println(predicate.test(9));

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().filter(args0 -> args0 % 2 == 0).forEach(t -> System.out.println("Print Even :" + t));
		
	}

//	@Override
//	public boolean test(Integer arg0) {
//		if(arg0 % 2 == 0) {
//			return true;
//		}else {
//			return false;
//		}
//	}

}
