package com.tnsif.day10.exceptionhandling;

public class TryCatchExample {
    static void performDivision(int x, int y) {
        System.out.println("I am in method");
        int z;
        try {
            System.out.println("I am in try block");
            z = x / y;
            System.out.println("Result of z: " + z); // This message will be printed if no exception occurs
        } catch (ArithmeticException e) {
            System.out.println("I am in catch block: " + e.getMessage());
        }
    }
}
