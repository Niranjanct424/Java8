package com.java.interface8;

interface run
{
	void running();
}
interface jump
{
	void running();
	
	default void jump(){
		System.out.println("Hello i m jumping from default ");
	}
}
public class A implements run,jump {

	public static void main(String[] args) {
		A obj = new A();
		obj.running();
		obj.jump();
		
	
	}

	@Override
	public void running() {
		System.out.println("running");
		
	}
}
