package com.functions;

public class FunctionTypes {

    public static void greet() {
        System.out.println("Hello! This is a simple greeting.");
    }
    public static void displaySum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
    public static String getMessage() {
        return "This function returns a message.";
    }
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        greet();
        displaySum(10, 20);
        String msg = getMessage();
        System.out.println(msg);
        int result = multiply(5, 4);
        System.out.println("Multiplication result: " + result);
    }
}
