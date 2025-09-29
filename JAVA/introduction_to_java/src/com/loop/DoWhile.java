package com.loop;

public class DoWhile {
	public static void main(String[] args) {
		int i=0;
		do {
			System.out.println(i);
			if(i%2==0) {
				System.out.println(i+" even");
			}
			else {
				System.out.println(i+" odd");
			}
			i++;
		} while(i<=5);
	}
}
