package com.abstraction;

public interface Vehicle {
	//can have only abstract methods
	abstract void start();
	void stop();
	public static void display() {
		System.out.println("Hello Display");
	}
}
