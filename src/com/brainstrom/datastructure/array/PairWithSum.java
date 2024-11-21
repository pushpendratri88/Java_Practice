package com.brainstrom.datastructure.array;

import java.util.HashSet;

public class PairWithSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 6, 15, 8, 1, 3};
        int target = 9;
        findPairWithSum(nums, target);
    }

    private static void findPairWithSum(int[] nums, int target) {
        HashSet<Integer> seen =  new HashSet<>();
        for(int num : nums){
            int compliment = target - num;
            if(seen.contains(compliment)){
                System.out.println("["+compliment + " , " + num+ "]");
            }
            seen.add(num);
        }
    }
}
