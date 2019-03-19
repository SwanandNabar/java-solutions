package com.practice.LeetCode;

import java.util.Hashtable;

public class CountLettersInWord {

    public static int countLetters(String word) {

        int count = 0;
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for(char ch : word.toCharArray()) {
            hashtable.put(ch, hashtable.containsKey(ch) ? (hashtable.get(ch) + 1) : 1);
            count = Integer.max(count, hashtable.get(ch));
        }

        return count;
    }

    public static void main(String[] args) {
        String word = "scienceeeEEsspp{{Eesssssss";
        System.out.println(countLetters(word));
    }
}
