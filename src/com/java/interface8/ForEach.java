package com.java.interface8;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		
		Integer[] arr = {5,5,7,2,7};
		List<Integer> list = Arrays.asList(5,5,7,2,7);		
//		for and enanced forloop external loop
		for (Integer integer : list) {
			System.out.print(integer);
		}
		
//		forEach loop This is internal loop which makes code fater
		list.forEach(i -> System.out.print(" "+i));
	}
	
}
