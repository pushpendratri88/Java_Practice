package com.brainstrom.leetCode;


public class RemoveDuplicatesSortedArrayII {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,2,2};
//        System.out.println(removeDuplicate(nums));
        removeDuplicate(nums);
    }

    private static int removeDuplicate(int[] nums) {
        int k=0;
        int count = 1;
        nums[k++] =nums[0];
        boolean flag = false;
        for(int i = 0; i < nums.length - 1; i++){
            flag = true;
            if(count < 2){
                if(nums[i] == nums[i+1]){
                    count++;
                    nums[k++]= nums[i+1];
                }
                else{
                    if(nums[i] != nums[i+1]){
                        count = 0;
                        nums[k++]= nums[i+1];
                    }
                }
            }
            else{
                if(nums[i] != nums[i+1]){
                    count = 0;
                    nums[k++]= nums[i+1];
                    count++;
                }
            }

        }
        nums[k-1] =nums[nums.length - 1];

        for(int i = 0; i < k-1; i++){
            System.out.println(nums[i]);
        }
        return  k-1;
    }
}
