package com.brainstrom.interview;

public class maxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(findMaxProfit(prices));

    }

    private static int findMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            if(maxPrice < price - minPrice){
                maxPrice = price - minPrice;
            }
        }
        return maxPrice;
    }

}
