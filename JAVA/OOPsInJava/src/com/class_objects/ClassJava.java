package com.class_objects;

class Car{
	String brand;
	int year;
	
	public void display() {
		System.out.println("brand : "+brand);
		System.out.println("year : "+year);
	}
}
public class ClassJava {
	public static void main(String[] args) {
		Car obj1=new Car();
		obj1.brand="Testla";
		obj1.year=2021;
		obj1.display();
		
		Car obj2=new Car();
		obj2.brand="Maruthi";
		obj2.year=2017;
		obj2.display();
	}
}
