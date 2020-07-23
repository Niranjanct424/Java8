package com.java.interface8;

interface Speak
{
	 void tellMyName(String name);
//	 void sayHi();
}

public class LamdaDemo {

	public static void main(String[] args) {
		Speak obj1;
		Speak obj2;
		Speak obj3;
//		use curly braces when we have more than statements
		obj1 = (String i) -> {	System.out.println(i+" welcome to java8 lambda expression");
		System.out.println("and use curly braces when we have more than statements"); };
		
		obj2 = (i) -> System.out.println(i+" welcome to java8 lambda expression");
		
		obj3 = i -> System.out.println(i+" welcome to java8 lambda expression");
		
		
		obj1.tellMyName("Niranjan");
		obj2.tellMyName("Tangodar");
		obj2.tellMyName("bro");
	}

}
