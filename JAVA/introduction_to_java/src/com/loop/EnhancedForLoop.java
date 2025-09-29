package com.loop;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int[] arr= {120,651,345};
		//to traverse an array
		for(int a : arr) {
			System.out.println(a);
		}
		System.out.println();
		for(int a : arr) {
			System.out.println(a+" ");
		}
	}
}
