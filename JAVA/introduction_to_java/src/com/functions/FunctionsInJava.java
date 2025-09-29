package com.functions;

public class FunctionsInJava {
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a=90;
		int b=75;
		//creating obj
		//classname objname = new classname()
		FunctionsInJava fun=new FunctionsInJava();
		int res = fun.add(a, b);
		System.out.println("Result : "+res);
		int res1 = fun.add(45,79);
		System.out.println("Result : "+res1);
	}
}