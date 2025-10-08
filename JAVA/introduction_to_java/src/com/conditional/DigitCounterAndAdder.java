package com.conditional;

import java.util.Scanner;

public class DigitCounterAndAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int original = Math.abs(number); 
        int digitCount = 0;
        int digitSum = 0;
        while (original != 0) {
            int digit = original % 10;
            digitSum += digit;
            digitCount++;
            original /= 10;
        }
        if (number == 0) {
            digitCount = 1;
            digitSum = 0;
        }
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
    }
}
