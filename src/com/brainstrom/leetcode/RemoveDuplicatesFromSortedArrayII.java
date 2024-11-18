package com.brainstrom.leetcode;


public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int localCount = 0;
        int globalCount = 1;
        int compareNo = nums[0];
        int newAssign = 0;
        for(int i = 0; i < nums.length; i++){
            if(compareNo == nums[i]){
                if(localCount < 2){
                    localCount++;
                    globalCount++;
                }
                else{
                    newAssign = i ;
                    for(int j = i; j < nums.length; j++){
                        if(compareNo != nums[j]){
                            nums[newAssign++] = nums[j];
                        }
                    }
                }
            }
            else {
                compareNo = nums[i];
                localCount = 0;
                localCount++;
                globalCount++;
            }
        }
        return globalCount;
    }
}
