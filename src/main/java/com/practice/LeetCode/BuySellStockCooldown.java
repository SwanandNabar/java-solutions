package com.practice.LeetCode;

import java.util.*;

public class BuySellStockCooldown {

    public static int maxProfit(int[] prices) {
        int maxTotalProfit = 0;
        List<Integer> firstBuySellProfits = new ArrayList<>();
        int minPricesSoFar = Integer.MAX_VALUE;
        int high = prices.length;
        int low = 0;
        int mid = 0;

        if (high % 2 != 0) {
            mid = (high + low) / 2;
        }

        // forward

        for (int i = 0; i < prices.length; i++) {
            minPricesSoFar = Math.min(minPricesSoFar, prices[i]);
            maxTotalProfit = Math.max(maxTotalProfit, prices[i]-minPricesSoFar);
            firstBuySellProfits.add(maxTotalProfit);
        }

        // backward
        int maxPricesSoFar = Integer.MIN_VALUE;
        for (int j = prices.length -1; j > 0; j--) {
            maxPricesSoFar = Math.max(maxPricesSoFar, prices[j]);
            maxTotalProfit = Math.max(maxTotalProfit, maxPricesSoFar = prices[j] + firstBuySellProfits.get(j - 1));
        }

        return maxTotalProfit;

    }

    public static void main(String[] args) {
        int prices[] = {1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }
}
