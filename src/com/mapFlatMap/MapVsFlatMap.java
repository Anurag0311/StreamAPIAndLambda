package com.mapFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Customer> customers = EkartDataBase.getAll();

		// map - one to one mapping --every customers have only one email
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		// map - one to one mapping -- here map return list of list as it cannot flatten
		// the 2D list
		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);

		// Flatmap - one to many --On above example we can use FlatMap
		List<String> phoneNo = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phoneNo);
	}

}
