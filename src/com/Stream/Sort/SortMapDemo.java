package com.Stream.Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.Stream.demo.Employee;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		Map<Employee, Integer> employeeMap = new TreeMap<>((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
		System.out.println(employeeMap);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		/*
		 * Collections.sort(entries, new Comparator<Entry<String, Integer>>(){
		 * 
		 * @Override public int compare(Entry<String, Integer> arg0, Entry<String,
		 * Integer> arg1) { // TODO Auto-generated method stub return
		 * arg0.getKey().compareTo(arg1.getKey()); }
		 * 
		 * });
		 */
		/*
		 * Collections.sort(entries, (arg0, arg1) ->
		 * arg0.getKey().compareTo(arg1.getKey()));
		 * 
		 * for(Entry<String,Integer> entry : entries) {
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 */
		/*
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out
		 * ::println);
		 * map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.
		 * out::println);
		 */
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);
	}

}
