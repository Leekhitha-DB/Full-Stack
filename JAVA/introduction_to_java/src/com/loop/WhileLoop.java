package com.loop;

public class WhileLoop {
	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			System.out.println(i);
			if(i%2==0) {
				System.out.println(i+" even");
			}
			else {
				System.out.println(i+" odd");
			}
			i++;
		}
	}

}
