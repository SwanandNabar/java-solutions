package com.practice.GeeksForGeeks.Strings;

public class SwapFirstAndLastChar {

    public static String swapFirstAndLastChar(String str) {

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int k = i;
            while (i < ch.length && ch[i] != ' ') {
                i++;
            }

            // Swapping
            char temp = ch[k];
            ch[k] = ch[i - 1];
            ch[i - 1] = temp;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        System.out.println(swapFirstAndLastChar("geeks for geeks"));
    }
}
