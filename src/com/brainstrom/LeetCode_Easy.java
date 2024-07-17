package com.brainstrom;

public class LeetCode_Easy {

    public int[] twoSum(int[] nums, int target) {
        int[] intArray = new int[2];
        outerLoop:
        for(int i = 0; i < nums.length-1;i++){
            for(int j = i+1; j < nums.length ; j++){
                int temp =nums[i]+nums[j];
                if(temp == target){
                    intArray[0]= i;
                    intArray[1]=j;
                    break outerLoop;
                }
            }

        }
        return intArray;
    }

//    public int removeDuplicates(int[] nums) {
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i]== nums[j]){
//                  nums[i] = nums[j];
//                }
//                else {
//                    nums[j]
//                }
//
//            }
//        }
//        return 4;
//    }
}
