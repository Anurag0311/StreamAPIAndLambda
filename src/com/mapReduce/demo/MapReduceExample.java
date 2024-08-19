package com.mapReduce.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
		int sum1 = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum1);

		int sum2 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum2);

		Optional<Integer> sum3 = numbers.stream().reduce(Integer::sum);
		System.out.println(sum3.get());

		int product = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(product);

		int min = numbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> a > b ? b : a);
		System.out.println(min);

		int min1 = numbers.stream().reduce(Integer::min).get();
		System.out.println(min1);

		List<String> words = Arrays.asList("corejava", "spring", "hibernate");

		String longestStreamWord = words.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println(longestStreamWord);
		
		//Average salary of Grade A Employees
		List<Employee> employees = EmployeeDatabase.getEmployees();
		Double Avg = employees.stream().filter(employee -> employee.getGrade().equals("A")).map(employee -> employee.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		System.out.println(Avg);

		
		Double sum = employees.stream().filter(employee -> employee.getGrade().equals("A")).map(employee -> employee.getSalary()).mapToDouble(i -> i).sum();
		System.out.println(sum);
	}

}
