package com.practice.Apps;

import java.util.Scanner;

/**
 * @author snabar
 * Class to perform minimal calculator functions using only 2 inputs
 */
public class Calculator {

    /**
     * Method to accept user input to calculate and call respective methods based on selection
     */
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

    /**
     * Add two numbers
     *
     * @param n1 accepts first number parameter from user to add
     * @param n2 accepts second number parameter from user to add
     */
    private static void addTwoNumbers(double n1, double n2) {
        System.out.println("Sum of two numbers is " + (n1 + n2));
        calculate();
    }

    /**
     * Subtract two numbers
     *
     * @param n1 accepts first number parameter from user to subtract
     * @param n2 accepts second number parameter from user to subtract
     */
    private static void subTwoNumbers(double n1, double n2) {
        System.out.println("Difference of two numbers is " + (n1 - n2));
        calculate();
    }

    /**
     * Divide two numbers
     *
     * @param n1 accepts first number parameter from user to divide
     * @param n2 accepts second number parameter from user to divide
     */
    private static void divideTwoNumbers(double n1, double n2) {
        System.out.println("Division of two numbers is " + (n1 / n2));
        calculate();
    }

    /**
     * Multiply two numbers
     *
     * @param n1 accepts first number parameter from user to multiply
     * @param n2 accepts second number parameter from user to multiply
     */
    private static void multiplyTwoNumbers(double n1, double n2) {
        System.out.println("Multiplication of two numbers is " + (n1 * n2));
        calculate();
    }

    /**
     * Entry point to calculate user accepted operation on two numbers
     *
     * @param args string array to accept arguments
     *             No arguments supported, will be ignored
     */
    public static void main(String[] args) {
        calculate();
    }
}
