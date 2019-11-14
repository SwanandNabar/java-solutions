package com.practice.LeetCode.AmazonInterview;

public class CheckIfStringUniqueCharacters {

    public static boolean isUnique (String s) {

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(0) == s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "lovel";
        System.out.println(isUnique(s));
    }
}
