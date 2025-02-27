package com.brainstrom.leetcode;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int maxSum = 0;
        int currentSum = 0;
         for(int n : nums){
             currentSum = currentSum + n;
             currentSum = Math.max(currentSum, n);
             maxSum = Math.max(maxSum,currentSum);
         }
         return maxSum;
    }
}
