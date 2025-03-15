package com.brainstrom.datastructure.array.twopointer;

public class MaxSubArray {
    public static void main(String[] args) {
        int [] nums = {-1};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int current = nums[0];
        for(int i=1;i < nums.length;i++){
           current  = current+nums[i];
           current = Math.max(nums[i],current);
           maxSum = Math.max(maxSum,current);
        }
        return maxSum;
    }
}
