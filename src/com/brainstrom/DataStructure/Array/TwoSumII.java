package com.brainstrom.DataStructure.Array;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] number = {-10,-8,-2,1,2,5,6};
        int target = 0 ;
        System.out.println(Arrays.toString(twoSumII(number,target)));
    }

    private static int[] twoSumII(int[] intArray, int target) {
        int[] resultArray = new int[intArray.length];
        int resultCount = 0;
        for (int i = 0; i < intArray.length;i++){
            for(int j = i+1; j < intArray.length;j++){
                if(target == intArray[i]+intArray[j]){
                    resultArray[resultCount++] =i+1;
                    resultArray[resultCount++] =j+1;
                }
            }
        }
        return Arrays.copyOf(resultArray,resultCount);
    }
}
