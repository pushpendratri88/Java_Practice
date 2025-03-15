package com.brainstrom.datastructure.array.twopointer;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        System.out.println(Arrays.toString(removeDuplicates(nums)));

    }

    public static int[] removeDuplicates(int[] nums) {
        int x = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[x] != nums[i]){
                x=x+1;
                nums[x] =nums[i];
            }
        }
        return Arrays.copyOf(nums, x+1);
    }
}
