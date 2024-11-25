package com.brainstrom.datastructure.array;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] number = {2,7,11,15};
        int target = 9 ;
        System.out.println(Arrays.toString(twoSumII(number,target)));
    }

    private static int[] twoSumII(int[] intArray, int target) {
        for (int i = 0; i < intArray.length;i++){
            for(int j = i+1; j < intArray.length;j++){
                if(target == intArray[i]+intArray[j]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
