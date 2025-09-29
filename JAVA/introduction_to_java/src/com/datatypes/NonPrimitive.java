package com.datatypes;

import java.util.Arrays;

public class NonPrimitive {
	public static void main(String[] args) {
		//string
		String name = "liki";
		System.out.println("Your name : "+name);
		//array
		int[] arr= {2,1,5,8,3};
		//1st type
		System.out.println("Your marks : "+Arrays.toString(arr));
		System.out.println("OR");
		//2nd type
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
