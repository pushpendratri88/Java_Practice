package com.brainstrom.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbersArray448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(findDisappearedNumbers(nums).toArray()));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int idx =  Math.abs(nums[i]) - 1;
            if(nums[idx] < 0){
                continue;
            }
            nums[idx] = nums[idx] * -1;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                resultList.add(i+1);
            }
        }
        return resultList;
    }
}
