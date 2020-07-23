package com.java.interface8.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
//	employee whose salary is greater than 500000 
	public static List<Employee> evaluateTaxUsers(String input)
	{
		return (input.equalsIgnoreCase("tax"))
			 ? DataBase.getEmployees().stream().filter(salaray -> salaray.getSalary()>500000).collect(Collectors.toList()) 
			 : DataBase.getEmployees().stream().filter(salaray -> salaray.getSalary()<=500000).collect(Collectors.toList());

		}
//		if(input.equalsIgnoreCase("tax"))
//		{
//			return DataBase.getEmployees().stream().filter(salaray -> salaray.getSalary()>500000).collect(Collectors.toList());
//
//		}
//		else
//		{
//			return DataBase.getEmployees().stream().filter(salaray -> salaray.getSalary()<=500000).collect(Collectors.toList());
//
//		}
//			}
	
	public static void main(String[] args) {
//		System.out.println(TaxService.evaluateTaxUsers());
		List<Employee> list = TaxService.evaluateTaxUsers("tax");
		List<Employee> list2 = TaxService.evaluateTaxUsers("non-tax");
		System.out.println("tax payable users");
		list.forEach(i -> System.out.println(i));
		System.out.println("----------------------------------------------");
		System.out.println("non-tax payable users");
		list2.forEach(i -> System.out.println(i));
		
//		List<Employee> list2 = TaxService.evaluateTaxUsers("non-tax");
//		System.out.println("tax payable users");
//		for (Object object : list) {
//			System.out.println(object);
//		}
//		System.out.println("non-tax payable users");
//		for (Object object : list2) {
//			System.out.println(object);
//		}
	}
}
