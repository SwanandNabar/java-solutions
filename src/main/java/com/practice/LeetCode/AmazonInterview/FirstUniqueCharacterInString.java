package com.practice.LeetCode.AmazonInterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public static int firstUniqueCharacter(String s) {

        Map<Character, Integer > map = new LinkedHashMap<>();

        char[] process = s.toCharArray();

        for (char c : process) {
            Integer n = map.get(c);
            n = (n == null) ? 1 : ++n;
            map.put(c, n);
        }

        for (int i = 0; i < process.length; i++) {
            if ( map.get(process[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqueCharacter(s));
    }
}
