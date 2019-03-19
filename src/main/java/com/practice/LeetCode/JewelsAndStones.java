package com.practice.LeetCode;

import java.util.HashMap;
import java.util.Hashtable;

public class JewelsAndStones {

    public static int numJewelsInStones(String J, String S) {

        int count = 0;
        HashMap<Character, Integer> countJewels = new HashMap<>();

        for(char ch : S.toCharArray()) {
            countJewels.put(ch, countJewels.containsKey(ch) ? (countJewels.get(ch) + 1): 1);
        }

        for (char ch: J.toCharArray()) {
            if (countJewels.containsKey(ch)) {
                count += countJewels.get(ch);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        System.out.println(numJewelsInStones(J,S));

    }
}
