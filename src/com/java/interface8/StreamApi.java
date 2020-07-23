package com.java.interface8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StreamApi {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Niranjan");
		list.add("tangodar");
		list.add("yadav");
		list.add("King");
		list.add("Ninja");
		
		list.stream().forEach(yo -> System.out.println(yo));
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1,"apple");
		map.put(2,"bold");
		map.put(3,"cold");
		map.put(4,"dog");
		map.put(5,"empty");

		map.forEach((key,value)->System.out.println(key+" "+value));
		
		map.entrySet().stream().forEach(obj -> System.out.println(obj));
		
		System.out.println("sorted elements ");
		list.stream().sorted().forEach(yo -> System.out.println(yo));
		
		System.out.println("consumer..........");
		Consumer<String> consumer = (t) -> System.out.println(t);
		for (String name : list) {
			consumer.accept(name);
		}
		
//		filter internally uses predicate interface  
		System.out.println(" filter for conditional check ");
		list.stream().filter(name -> name.startsWith("N")).forEach(yo -> System.out.println(yo));
		
		map.entrySet().stream().filter(k -> k.getKey()%2 == 0).forEach(obj -> System.out.println(obj));
		map.entrySet().stream().filter(k -> k.getValue().equals("apple")).forEach(obj -> System.out.println(obj));
		
		
	}

}
