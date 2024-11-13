package com.brainstrom.DataStructure.Array;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {4,1,2};
        System.out.println("Max Profit : "+ maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int lowestMinPrice = Integer.MAX_VALUE;
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        int maxProfit = 0;
        boolean resetMinPrice = false;
        int totalProfit  = 0;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
                if(!resetMinPrice){
                    lowestMinPrice = price;
                }
            }
            else if(price > maxPrice){
                maxPrice = price;
            }
            if(maxProfit < price - minPrice){
                totalProfit = totalProfit + (price - minPrice);
                minPrice  = price;
                resetMinPrice = true;
                maxProfit = 0;
            }
        }

        return (totalProfit > 0 && totalProfit < maxPrice - lowestMinPrice)? maxPrice - lowestMinPrice : totalProfit;
    }
}
