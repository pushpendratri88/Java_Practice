package com.brainstrom.leetcode;

public class MissingNumber268 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(findMissingNumber(nums));

    }

    private static int findMissingNumber(int[] nums) {
        int arraySum = 0;
        int acctualSum = 0;
        for(int num : nums){
            acctualSum = acctualSum + num;
        }
        arraySum = (nums.length * (nums.length+1))/2;
        return arraySum - acctualSum;
    }
}
