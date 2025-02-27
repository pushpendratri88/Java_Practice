//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]

package com.brainstrom.datastructure.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] intArray = {2,3,11,7,7,5,4};
        int target = 9 ;
        System.out.println(Arrays.toString(twoSum(intArray,target)));

    }

    private static int[] twoSum(int[] intArray, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < intArray.length; i++){
            int complement = target - intArray[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement) ,i};
            }

            map.put(intArray[i],i);
        }
        return new int[]{};
    }

}
