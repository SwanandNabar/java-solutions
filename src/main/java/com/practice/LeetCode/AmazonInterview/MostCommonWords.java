package com.practice.LeetCode.AmazonInterview;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWords {

    public static String mostCommonWords(String paragraph, String[] banned) {

        Map<String, Integer> countFrequentWords = new HashMap<>();
        String temp = paragraph.toLowerCase().replaceAll("[^a-zA-Z]+", " ");
        int maxcount=0;
        String maxWord="";
        int isWordBanned=0;

        for (String s : temp.split(" ")) {
            Integer n = countFrequentWords.get(s);
            n = (n == null) ? 1 : ++n;
            isWordBanned = 0;
            for (String word : banned) {

                if (word.equals(s)) {
                    isWordBanned = 1;
                }
            }
            if (isWordBanned != 1 && !s.isEmpty()) {

                if (n > maxcount) {
                    maxcount = n;
                    maxWord = s;
                }
                countFrequentWords.put(s, n);
            }
        }
        return maxWord;
    }

    public static void main(String[] args) {


        String news = "abc abc? abcd the jeff!";
        String[] asdas = {"abc","abcd","jeff"};

        System.out.println(mostCommonWords(news, asdas));
    }
}
