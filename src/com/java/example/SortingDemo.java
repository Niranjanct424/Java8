package com.java.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingDemo {
	public static void main(String[] args) {

		List<Employee> employeeDetails = DataBase.getEmployees();
		Collections.sort(employeeDetails, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		/*
		 * sorted employees based on salary ascending order
		 */
		System.out.println("sorted employees based on salary ascending order");
		employeeDetails.forEach(emp -> System.out.println(emp));
		/*
		 * used comparator interface to sort values with ananimous
		 */
				
		
		Collections.sort(employeeDetails, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSalary() - o1.getSalary());
			}
		});

		/*
		 * sorted employees based on salary descending order
		 */
		System.out.println("Sorted employees based on salary descending order");
		employeeDetails.forEach(emp -> System.out.println(emp));
		/*
		 * Sorted using lamdaExpression 
		 */
		System.out.println("Sorted using lamdaExpression");
		Collections.sort(employeeDetails, (emp1,emp2) ->(int) (emp1.getSalary() - emp2.getSalary()));
		employeeDetails.forEach(emp -> System.out.println(emp));
		
		System.out.println("Sorted salary using Stream api");
		List<Employee> employees = employeeDetails.stream().sorted((emp1,emp2) -> (int)(emp1.getSalary() - emp2.getSalary())).collect(Collectors.toList());
		employees.forEach(emp -> System.out.println(emp));
		System.out.println("printing employees using method reference");
		employeeDetails.stream().sorted((emp1,emp2) -> (int)(emp1.getSalary() - emp2.getSalary())).forEach(System.out::println);
		/*
		 * Sorted employees based on names using method reference
		 */
		System.out.println("Sorted employees based on Name ");
		employeeDetails.stream().sorted(Comparator.comparing(Employee :: getName)).forEach(System.out::println);
		
		System.out.println("Sorted employees based on Dept ");
		List<Employee> sortOnDept = employeeDetails.stream().sorted(Comparator.comparing(Employee :: getDept)).collect(Collectors.toList());
		sortOnDept.forEach(dept -> System.out.println(dept));
		
	}
}
