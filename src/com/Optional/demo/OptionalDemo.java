package com.Optional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {

	public static Customer getCustomerByEmailId(String email) throws Exception {
		List<Customer> customers = EkartDataBase.getAll();
		return customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElseThrow(() -> new Exception("no customer present with this email id"));
	}

	public static void main(String[] args) throws Exception {
		Customer customer = new Customer(101, "john", null, Arrays.asList("397937955", "21654725"));

		Optional<Object> myOptional = Optional.empty();
		System.out.println(myOptional);

		// Use this if the value is never null
//		Optional<String> email = Optional.of(customer.getEmail());
//		System.out.println(email);

		// Use this if you donot know if value can be null
		Optional<String> emailOfNullable = Optional.ofNullable(customer.getEmail());
		System.out.println(emailOfNullable);
		// We can call the get method to get the value if it is null we can get an
		// Exception of NoSuchElement So use it carefully like below
		/*
		 * if(emailOfNullable.isPresent()) { System.out.println(emailOfNullable.get());
		 * }
		 */
		// ANOTHER APPROACH-orElse - if the instance give is null it will return the
		// value entered inside orElse Argument
		System.out.println(emailOfNullable.orElse("default@email.com"));

		// Another Approach - throwing an exception that can be customized
//		System.out.println(emailOfNullable.orElseThrow(() -> new IllegalArgumentException("Email not present")));

		System.out.println(emailOfNullable.map(String::toUpperCase).orElseGet(() -> "Default email..."));

		
		getCustomerByEmailId("pqr");
	}

}
