package com.practice.Apps;

import java.util.ArrayList;

public class MyCounter {
    public MyCounter (int startValue) {
        counter = startValue;
    }

    public MyCounter() {
        counter = 1;
    }

    public int nextValue () {
        int temp = counter;
        counter++;
        return temp;
    }
    // instance variable
    private static int counter;

    private void readList (ArrayList list) {
        while(true) {
            String item = readInt("/ ");
            if (item.equals("")) break;
            list.add(item);
        }
    }

    private String readInt(String s) {
        return s;
    }

    public void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

        while (true) {
            String line = readInt("?");
            if (line.equals('0')) break;
            strList.add(line);
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
