package com.brainstrom.leetcode;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int x = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[x] !=nums[i]){
                x= x+1;
                nums[x] = nums[i];
            }
        }
        return x+1;
    }
}
