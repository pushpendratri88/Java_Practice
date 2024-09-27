//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
package com.brainstrom.leetCode;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        k= k % nums.length;
        rotateArray(nums, 0 , nums.length-1);
        rotateArray(nums, 0, k-1);
        rotateArray(nums, k, nums.length-1);
        for(int i=0;i < nums.length;i++){
            System.out.print(nums[i]);
        }
    }

    private static void rotateArray(int[] nums, int start, int end) {
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
