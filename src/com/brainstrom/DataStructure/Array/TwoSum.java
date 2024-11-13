//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]

package com.brainstrom.DataStructure.Array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] intArray = {2,3,11,7,7,5,4};
        int target = 9 ;
        System.out.println(Arrays.toString(twoSum(intArray,target)));

    }

    private static int[] twoSum(int[] intArray, int target) {
        int[] resultArray = new int[intArray.length];
        int resultCount = 0;
        for (int i = 0; i < intArray.length;i++){
            for(int j = i+1; j < intArray.length;j++){
                if(target == intArray[i]+intArray[j]){
                    resultArray[resultCount++] =i;
                    resultArray[resultCount++] =j;
                }
            }
        }
        return Arrays.copyOf(resultArray,resultCount);
    }

}
