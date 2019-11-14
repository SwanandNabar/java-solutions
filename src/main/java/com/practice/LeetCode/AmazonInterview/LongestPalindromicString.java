package com.practice.LeetCode.AmazonInterview;

public class LongestPalindromicString {

    public static String longestPalindrome(String s) {

        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {

            }
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "babad";
        longestPalindrome(s);
    }
}
