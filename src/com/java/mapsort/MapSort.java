package com.java.mapsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.java.listexample.Employee;

public class MapSort {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("John", 2);
		map.put("Hello", 3);
		map.put("Zen", 1);
		map.put("apple", 5);
		map.put("Black", 4);

		List<Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
//		Comparator is functional interface
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareToIgnoreCase(o2.getKey());
			}
		});

		System.out.println("sorted map data keys using traditional approach ");
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		/*
		 * sorting keys using lambda
		 */
		System.out.println("Sorted using Lambda expression ");
		Collections.sort(entries, (ob1, ob2) -> ob1.getKey().compareToIgnoreCase(ob2.getKey()));

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		/*
		 * sorting values using lambda
		 */
		System.out.println("Sorted map values using Lambda expression ");
		Collections.sort(entries, (ob1, ob2) -> ob1.getValue() - (ob2.getValue()));

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		/*
		 * sorting based on stream api
		 */
		System.out.println("sorting keys based on stream api");

		List<Entry<String, Integer>> entries2 = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		entries2 = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
		entries2.forEach(ent -> System.out.println(ent));
		System.out.println("---------------sorting based on values stream api");
		entries2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
		entries2.forEach(ent -> System.out.println(ent));

		/*
		 * using functional interface comparator
		 */
		Map<Employee, Integer> employees = new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});

		employees.put(new Employee(176, "Roshan", "IT", 600000), 40);
		employees.put(new Employee(388, "Bikash", "CIVIL", 900000), 70);
		employees.put(new Employee(470, "Bimal", "DEFENCE", 500000), 20);
		employees.put(new Employee(624, "Sourav", "CORE", 400000), 10);
		employees.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 67);

		System.out.println("sorted map data emp names ");
		System.out.println(employees);

		System.out.println("sorted map data emp names in descening order");
		Map<Employee, Integer> employees2 = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		employees2.put(new Employee(176, "Roshan", "IT", 600000), 40);
		employees2.put(new Employee(388, "Bikash", "CIVIL", 900000), 70);
		employees2.put(new Employee(470, "Bimal", "DEFENCE", 500000), 20);
		employees2.put(new Employee(624, "Sourav", "CORE", 400000), 10);
		employees2.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 67);
		System.out.println(employees2);
		/*
		 * sorted maps based Stream api
		 */
		System.out.println("sorted maps based Stream api");
		employees2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);
		System.out.println(".....sorted reversed emp salary maps based Stream api..............");
		employees2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
		.forEach(System.out::println);
		System.out.println("-----------sort on values like 10 ,20, 40");
		employees2.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		System.out.println("sort on names");
		employees2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
		.forEach(System.out::println);

	}

}
