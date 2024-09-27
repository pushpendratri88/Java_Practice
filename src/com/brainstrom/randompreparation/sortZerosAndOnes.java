package com.brainstrom.randompreparation;

import java.util.Arrays;

public class sortZerosAndOnes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 0, 0, 1, 0};
        System.out.println(Arrays.toString(sortZerosAndOnes(nums)));
    }

    private static int[] sortZerosAndOnes(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
           while (nums[left] == 0) {
                left++;
            }
            while (nums[right] == 1) {
                right--;
            }
            if(left < right){
                nums[left] = 0;
                nums[right] =1;
            }
        }
        return nums;
    }
}
