package com.brainstrom.array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = new int[]{7,6,4,3,1};
        System.out.println(bestTimeToBuyAndSell(nums));
    }

    private static int bestTimeToBuyAndSell(int[] prices) {
//        int maxDiff = 0;
//        for(int i=0;i < prices.length; i++){
//            for(int j=i+1;j < prices.length; j++){
//                if(maxDiff < (prices[j] -prices[i])){
//                    maxDiff = prices[j] -prices[i];
//                }
//            }
//        }
//        return maxDiff;


//        int buy = prices[0];
//        int buyPosition  = 0;
//        for(int i=1;i < prices.length; i++){
//            if(buy > prices[i] && i != prices.length-1 ){
//                buy = prices[i];
//                buyPosition = i;
//            }
//        }
//        int sell = buy;
//        for(int i=buyPosition;i < prices.length; i++){
//            if(sell < prices[i]){
//                sell = prices[i];
//            }
//        }
//        if(sell != buy){
//            return sell - buy;
//        }
//       return 0;

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
