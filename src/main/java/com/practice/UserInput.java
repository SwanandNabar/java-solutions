package com.practice;

import java.util.Scanner;

public class UserInput {

    private static void addTwoIntegers() {
        System.out.println("Add two integers");
        Scanner reader = new Scanner(System.in);

        int n1 = reader.nextInt();
        int n2 = reader.nextInt();

        System.out.println("Addition is: " + (n1 + n2) + ".");

        reader.close();

    }

    public static void main(String[] args) {
        addTwoIntegers();
    }
}
