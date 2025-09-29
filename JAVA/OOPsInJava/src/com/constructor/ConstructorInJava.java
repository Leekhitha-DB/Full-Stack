package com.constructor;

class GrandParent {
	public GrandParent() {
		super();
		System.out.println("Grand Parent Consructor");
	}
}
class Person extends GrandParent {
	int personId=20;
	public Person() {
		super();
		System.out.println("Person Constructor");
	}
}
class Student extends Person {
	public int id;
	public String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student(int id) {
		super();
		System.out.println(super.personId);
		this.id = id;
	}
}
public class ConstructorInJava {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Mohan");
		Student s2 = new Student(102);
		System.out.println("First Student");
		System.out.println("ID : "+s1.id);
		System.out.println("Name : "+s1.name);
		System.out.println();
		System.out.println("Second Student");
		System.out.println("ID : "+s2.id);
		System.out.println("Name : "+s2.name);//null as no value is passed
	}
}
