package com.practice.GeeksForGeeks.Stack;

public class TwoStacks {

    private static int size;
    private static int top1, top2;
    private static int arr[];

    TwoStacks(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    private static void push1(int x) {
        if (top1 < top2-1)  {
            top1++;
            arr[top1] = x;
        } else {
            System.exit(1);
        }
    }

    private static void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
    }

    private static int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.exit(1);
        }
        return 0;
    }

    private static int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args) {

        TwoStacks twoStacks = new TwoStacks(5);
        twoStacks.push1(1);
        twoStacks.push2(2);
        twoStacks.push1(3);
        twoStacks.push2(4);

        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop2());
    }
}
