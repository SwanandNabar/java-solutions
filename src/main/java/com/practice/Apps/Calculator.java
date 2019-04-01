package com.practice.Apps;

import java.util.Scanner;

/**
 * @author snabar
 * Class to build a perform functions of a minimal calculator with only 2 number input
 */
public class Calculator {

    /**
     * calculate method to ask user for input and call specific methods based on the selection
     */
    private static void calculate() {
        System.out.println("Enter your operation");
        System.out.println("add, sub, divide, multiply");

        Scanner reader = new Scanner(System.in);

        String userSelects = reader.next();


        if (userSelects.equals("add")) {
            addTwoNumbers();
        } else if (userSelects.equals("sub")) {
            subTwoNumbers();
        } else if (userSelects.equals("divide")) {
            divideTwoNumbers();
        } else if (userSelects.equals("multiply")) {
            multiplyTwoNumbers();
        } else {
            calculate();
        }
    }

    /**
     * method to add two numbers
     */
    private static void addTwoNumbers() {
        System.out.println("Enter two numbers to add ");
        Scanner reader = new Scanner(System.in);

        int n1 = reader.nextInt();
        int n2 = reader.nextInt();

        System.out.println("Sum of two numbers is " + (n1 + n2) + ".");
        calculate();
    }

    /**
     * method to subtract two numbers
     */
    private static void subTwoNumbers() {
        System.out.println("Enter two numbers to subtract ");
        Scanner reader = new Scanner(System.in);

        int n1 = reader.nextInt();
        int n2 = reader.nextInt();

        System.out.println("Difference of two numbers is " + (n1 - n2) + ".");
        calculate();
    }

    /**
     * method to divide two numbers
     */
    private static void divideTwoNumbers() {
        System.out.println("Enter two numbers to divide ");
        Scanner reader = new Scanner(System.in);

        double n1 = reader.nextDouble();
        double n2 = reader.nextDouble();

        System.out.println("Division of two numbers is " + (n1 / n2) + ".");
        calculate();
    }

    /**
     * method to multiply two numbers
     */
    private static void multiplyTwoNumbers() {
        System.out.println("Enter two numbers to multiply ");
        Scanner reader = new Scanner(System.in);

        int n1 = reader.nextInt();
        int n2 = reader.nextInt();

        System.out.println("Multiplication of two numbers is " + (n1 * n2) + ".");
        calculate();
    }

    /**
     *
     * @param args main method to accept array of string arguments
     */
    public static void main(String[] args) {
        calculate();
    }
}
