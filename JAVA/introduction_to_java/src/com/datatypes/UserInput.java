package com.datatypes;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int userInput;
		System.out.println("Enter a number : ");
		userInput=sc.nextInt();
		System.out.println("You entered : "+userInput);
		long mrks;
		mrks=sc.nextLong();
		System.out.println("Your marks : "+mrks);
		sc.close();
	}
}
