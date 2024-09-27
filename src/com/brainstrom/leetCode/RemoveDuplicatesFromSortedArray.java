//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
package com.brainstrom.leetCode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] intArray = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(intArray));

    }

    private static int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i < nums.length-1;i++){
            if(!(nums[i] ==nums[i+1])){
                nums[count++] = nums[i];
            }
        }
        nums[count] = nums[nums.length-1];
        return count+1;
    }
}
