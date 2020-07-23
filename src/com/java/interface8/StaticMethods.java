package com.java.interface8;

interface work
{
	static void dance()
	{
		System.out.println(" dancing with static method ");
	}
}
public class StaticMethods {
	public static void main(String[] args) {
		work.dance();
	}
}
