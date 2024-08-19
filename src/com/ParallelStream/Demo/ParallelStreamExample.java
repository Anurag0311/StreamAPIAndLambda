package com.ParallelStream.Demo;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	
	public static void main(String[] args) {
		
		long start = 0;
		long end = 0;
		
		/*
		 * start = System.currentTimeMillis();
		 * IntStream.range(1,100).forEach(System.out::println); end =
		 * System.currentTimeMillis(); System.out.println("Stream Time :" + (end -
		 * start));
		 * 
		 * System.out.println("KKKKKKKKKKKKKKSSSSSSSSSSSSSSSSSSS");
		 * 
		 * start = System.currentTimeMillis();
		 * IntStream.range(1,100).parallel().forEach(System.out::println); end =
		 * System.currentTimeMillis(); System.out.println("Parallel Stream Time :" +
		 * (end - start));
		 */
		
		/*
		 * IntStream.range(1,10).forEach(x ->{
		 * System.out.println("Thread :"+Thread.currentThread().getName()+" :"+x); });
		 * 
		 * 
		 * IntStream.range(1,10).parallel().forEach(x ->{
		 * System.out.println("Thread :"+Thread.currentThread().getName()+" :"+x); });
		 */
		List<Employee> employees = EmployeeDB.getEmployees();
		
		start = System.currentTimeMillis();
		double salaryWithStream = employees.stream().map(employee -> employee.getSalary()).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Normal Stream Time :" + (end - start)+" "+salaryWithStream);
		
		start = System.currentTimeMillis();
		double salaryWithParallelStream = employees.parallelStream().map(employee -> employee.getSalary()).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Parallel Stream Time :" + (end - start)+" "+salaryWithParallelStream);
	}
}
