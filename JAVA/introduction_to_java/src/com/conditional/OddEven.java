package com.conditional;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int userInput;
		System.out.println("Enter a number : ");
		userInput=sc.nextInt();
		System.out.println("You entered : "+userInput);
		if(userInput==0) {
			System.out.println(userInput+ " is zero");
		}
		else if(userInput >= 0) {
			System.out.println(userInput+ " is Positive");
			if(userInput%2==0) {
				System.out.println(userInput+ " is Even");
			}
			else {
				System.out.println(userInput+ " is Odd");
			}
		}
		else {
			System.out.println(userInput+ " is Negative");
		}
		sc.close();
	}
}