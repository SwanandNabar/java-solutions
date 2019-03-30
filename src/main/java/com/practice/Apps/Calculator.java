package com.practice.Apps;

import java.util.Scanner;

public class Calculator {

    private static void calculate() {
        System.out.println("Enter two numbers ");

        Scanner reader = new Scanner(System.in);
        double n1 = reader.nextDouble();
        double n2 = reader.nextDouble();


        System.out.println("Enter your operation");
        System.out.println("add(a), subtract(s), divide(d), multiply(m)");
        String userSelection = reader.next();

        if (userSelection.equals("a")) {
            addTwoNumbers(n1,n2);
        } else if (userSelection.equals("s")) {
            subTwoNumbers(n1,n2);
        } else if (userSelection.equals("d")) {
            divideTwoNumbers(n1,n2);
        } else if (userSelection.equals("m")) {
            multiplyTwoNumbers(n1,n2);
        } else {
            calculate();
        }

    }

    private static void addTwoNumbers(double n1, double n2) {
        System.out.println("Sum of two numbers is " + (n1 + n2));
        calculate();
    }


    private static void subTwoNumbers(double n1, double n2) {
        System.out.println("Difference of two numbers is " + (n1 - n2));
        calculate();
    }


    private static void divideTwoNumbers(double n1, double n2) {
        System.out.println("Division of two numbers is " + (n1 / n2));
        calculate();
    }


    private static void multiplyTwoNumbers(double n1, double n2) {
        System.out.println("Multiplication of two numbers is " + (n1 * n2));
        calculate();
    }

    public static void main(String[] args) {
        calculate();
    }
}
