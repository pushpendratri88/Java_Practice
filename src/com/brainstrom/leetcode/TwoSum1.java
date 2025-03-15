package com.brainstrom.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map =  new HashMap<>();
        int count = 0;
        int first = 0;
        int second = 0;
        for(int num : nums){
            int differ =  target - num;
            if(map.containsKey(differ)){
                first = map.get(differ);
                second = count;
            }
            map.put(num,count++);
        }
        return new int[]{first, second};
    }
}
