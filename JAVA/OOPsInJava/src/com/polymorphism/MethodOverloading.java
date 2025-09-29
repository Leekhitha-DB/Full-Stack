package com.polymorphism;

class Addition {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(double a,double b) {
		System.out.println(a+b);
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(10,3);
		a.add(12.0,31.0);
	}
}
