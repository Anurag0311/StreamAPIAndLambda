package com.Stream.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.Stream.demo.Database;
import com.Stream.demo.Employee;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		/*
		 * // Collections.sort(list); Collections.reverse(list);
		 * System.out.println(list);
		 * 
		 * list.stream().sorted().forEach(s -> System.out.println(s));//ASCENDING
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(s ->
		 * System.out.println(s));//DESCENDING
		 */	
		List<Employee> employees = Database.getEmployees();
//		Collections.sort(employees, new MyComparator());
		/*
		 * Collections.sort(employees, new Comparator<Employee>() { public int
		 * compare(Employee arg0, Employee arg1) { return (int) (arg0.getSalary()
		 * -arg1.getSalary()); } });
		 */

//		Collections.sort(employees, (arg0, arg1) -> (int) (arg0.getSalary() - arg1.getSalary()));
//		System.out.println(employees);
		
		//Using Lambda Expression
		employees.stream().sorted((arg0, arg1) -> (int) (arg0.getSalary() - arg1.getSalary())).forEach(s -> System.out.println(s));
		//Using Comparator's comparing method
		employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(s -> System.out.println(s));		
		//Using Employee Reference-Sorting by Employee Name
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(s -> System.out.println(s));
		
	
	}

}

/*
 * class MyComparator implements Comparator<Employee>{
 * 
 * @Override public int compare(Employee arg0, Employee arg1) { // TODO
 * Auto-generated method stub return (int) (arg0.getSalary() -
 * arg1.getSalary()); }
 * 
 * }
 */
