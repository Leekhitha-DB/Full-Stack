package com.inheritence;

class Animal {
	public void eat() {
		System.out.println("Animal Eating");
	}
}
class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog is Eating");
	}
	public void walking() {
		System.out.println("Dog is Walking");
	}
}
public class Inheritence1 {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.walking();
	}
}
