package com.brainstrom.leetCode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(findMaxProfit(prices));
    }
    private static int findMaxProfit(int[] prices) {
        int profit  = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price : prices){
              if(price < minPrice){
                  minPrice = price;
              }
              else if(price - minPrice > profit){
                    profit = price - minPrice;
              }
          }
        return profit;
    }

}
