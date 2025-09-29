package com.abstraction;

class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car class start method");
	}

	@Override
	public void stop() {
		System.out.println("Car class stop method");	
	}
}
public class AbstractInterface {
	public static void main(String[] args) {
		Car ca=new Car();
		ca.start();
		ca.stop();
		Vehicle.display();
	}
}
