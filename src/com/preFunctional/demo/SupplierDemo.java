package com.preFunctional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

//	@Override
//	public String get() {
//		// TODO Auto-generated method stub
//		return "Hi Little Bitch";
//	}

	public static void main(String[] args) {
//		System.out.println(supplier.get());
		
		
//		Supplier<String> supplier = () ->  "Hi Little Bitch";

//		
//		System.out.println(supplier.get());
		
		
		List<String> list1 = Arrays.asList();
//		System.out.println(list1.stream().findAny().orElseGet(supplier));
		System.out.println(list1.stream().findAny().orElseGet(() ->  "Hi Little Bitch"));
		
		
		
	}

}
