package com.brainstrom.DataStructure.Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(intArray));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] uniqueArray = new int[n];
        int newIndex = 0;
        for(int i = 0; i < n; i++){
            boolean isDuplicate = false;
            for(int j =i+1; j < n; j++){
                if(nums[i] == nums[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqueArray[newIndex++] = nums[i];
            }
        }
        return newIndex;
    }
}
