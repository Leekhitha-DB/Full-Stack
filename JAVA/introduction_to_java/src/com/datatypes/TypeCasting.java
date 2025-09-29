package com.datatypes;

public class TypeCasting {
	public static void main(String[] args) {
		//implicit
		int num=500;
		long num1=num;
		System.out.println("num : "+num);
		System.out.println("num1 : "+num1);
		
		//explicit
		long num2=355;
		int num3=(int) num2;
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		
		//java 10 onwards
		var a=152;
		var b="xyz";
		System.out.println(a+b);
		System.out.println(a+" "+b);
		//for format press ctrl+shift+f
	}
}
