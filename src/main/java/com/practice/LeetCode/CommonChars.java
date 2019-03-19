package com.practice.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonChars {

    public static List<String> commonChars(String[] A) {

        List<String> newArr = new ArrayList<>();

        Map<Character, Integer> counter = null;

        HashMap<Character, Integer> min = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            min.put(ch, Integer.MAX_VALUE);
        }


        for (String word : A ) {
            counter = new HashMap<>();

            for (char ch: word.toCharArray()) {
                counter.put(ch, counter.containsKey(ch) ? (counter.get(ch) + 1) : 1);
            }

            for(Map.Entry<Character,Integer> entry : min.entrySet()) {
                char alphabet = entry.getKey();
                int currentValue = counter.containsKey(alphabet) ? counter.get(alphabet) : 0;
                int currentMinValue = entry.getValue();
                min.put(alphabet, Math.min(currentMinValue,currentValue));
            }
        }

        for(Map.Entry<Character, Integer> entry : min.entrySet()) {
            int count = entry.getValue();
            while(count-- > 0) {
                newArr.add("" + entry.getKey());
            }
        }

        return newArr;

    }

    public static void main(String[] args) {
        String str [] ={"bella","label","roller"};
        System.out.println(commonChars(str));

    }
}
