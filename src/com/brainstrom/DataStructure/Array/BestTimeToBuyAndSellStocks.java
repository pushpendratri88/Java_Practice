package com.brainstrom.DataStructure.Array;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =  0;
        for (int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            if(maxProfit < price - minPrice){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
