package com.practice.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {

    public int leastBricks(List<List<Integer>> wall) {
        // check size of the wall if its 0 then just return
        if(wall.size() == 0) return 0;

        // initialize the count
        int count = 0;

        // maintain a map of the length of the brick
        Map<Integer, Integer> map = new HashMap<>();

        // iterate over the wall counting each brick
        for(List<Integer> brick : wall) {

            // initialize the length of the brick
            int length = 0;
            for (int i = 0 ; i < brick.size() - 1; i++) {
                length += brick.get(i);
                map.put(length, map.getOrDefault(length, 0) + 1);
                count = Math.max(count, map.get(length));
            }
        }
        return wall.size() - count;
    }

    public static void main(String[] args) {
        List<List<Integer>> wall = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        List<Integer> row3 = new ArrayList<>();
        List<Integer> row4 = new ArrayList<>();
        List<Integer> row5 = new ArrayList<>();
        List<Integer> row6 = new ArrayList<>();
        row1.add(1); row1.add(2); row1.add(2); row1.add(1);
        row2.add(3); row2.add(1); row2.add(2);
        row3.add(1); row3.add(3); row3.add(2);
        row4.add(2); row4.add(4);
        row5.add(3); row5.add(1); row5.add(2);
        row6.add(1); row6.add(3); row6.add(1); row6.add(1);
        wall.add(row1);
        wall.add(row2);
        wall.add(row3);
        wall.add(row4);
        wall.add(row5);
        wall.add(row6);
        System.out.println(new BrickWall().leastBricks(wall));
    }
}
