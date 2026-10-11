package com.devops.app;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Maven Demo Application");

        System.out.println("Addition: "
                + calculator.add(10, 20));

        System.out.println("Subtraction: "
                + calculator.subtract(20, 10));

        System.out.println("Multiplication: "
                + calculator.multiply(10, 5));

        System.out.println("Division: "
                + calculator.divide(20, 5));
    }
}
