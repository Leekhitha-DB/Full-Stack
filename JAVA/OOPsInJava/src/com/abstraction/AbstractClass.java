package com.abstraction;

abstract class Shape {
	abstract void draw(); //abstract method does not have body
	public void display() {
		System.out.println("This is display function");
	}
	//object cannot be created for the abstract class
}
class Circle extends Shape {
	@Override
	//has to provide body for the abstract method in child class
	void draw() {
		System.out.println("This is shape draw method");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		c.display();
	}
}
