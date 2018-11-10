package practice.LeetCode;

import java.util.Arrays;

public class NumberPalindrome {

    public static boolean numberPalindrome (int x) {

        int len = Integer.toString(x).length();
        String str = Integer.toString(x);
        String temp = "";
        int arr []= new int[len];

        if (x < 0) {
            return false;
        } else {
            for (int i = 0; i < len; i++) {
                arr[i] = x % 10;
                x = x / 10;
                temp = temp + arr[i];
            }
            if (temp.equals(str)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 123218;
//        numberPalindrome(num);
        if (numberPalindrome(num) == false) {
            System.out.println("Given number is not a palindrome");
        } else {
            System.out.println("Given number is a palindrome");
        }
    }
}
