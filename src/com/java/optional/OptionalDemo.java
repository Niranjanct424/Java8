package com.java.optional;

import java.util.Optional;

public class OptionalDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Traditional approach to null check lead to a long code
		 */
		String book = null;
		if (book != null) {
			System.out.println(book.toUpperCase());
		} else {
			book="elseJava";
			System.out.println(book.toUpperCase());
		}
		
		
		/*
		 * null check  using optional with else
		 */
		String name = null;
		Optional<String> optionalString = Optional.empty();
		optionalString = Optional.ofNullable(name);
		System.out.println(optionalString.orElse("elsevalue").toUpperCase());
//		String a = optionalString.orElse("elsevalue").toUpperCase();
//		System.out.println(a);
		
		/*
		 *using is isPresent method 
		 */
		String carName = "BMW";
		Optional<String> isCarPresent = Optional.empty();
		isCarPresent = Optional.ofNullable(carName);
		if (isCarPresent.get() != null) 
			System.out.println(isCarPresent.get());
//but else condation throws  java.util.NoSuchElementException
	}

}
