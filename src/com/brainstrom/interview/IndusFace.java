//Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.
//Examples:
//Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
//Output: 11
//Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
//Input: arr[] = {-2, -4}
//Output: –2
//Explanation: The subarray {-2} has the largest sum -2.

package com.brainstrom.interview;

import java.util.Arrays;

public class IndusFace {
    public static void main(String[] args) {
        int[] intArray  = {2, 3, -8, 7, -1, 2, 3, 5};
        int[] newArray = subArray(intArray);
        System.out.println(Arrays.toString(newArray));
        System.out.println("New Array Length : "+newArray.length);
        int maxsum = newArray[0];
        for(int i = 0; i < newArray.length; i++){
            if(maxsum < newArray[i]){
                maxsum = newArray[i];
            }
        }
        System.out.println("maxSum :" + maxsum);
    }
    private static int[] subArray(int[] intArray) {
        int[] maxArray = new int[60];
        int count = 0;
        for(int i = 0; i < intArray.length; i++){
            int maxSubArraySum = intArray[i];
            maxArray[count++] = maxSubArraySum;
            for(int j = i+1; j < intArray.length; j++){
                maxSubArraySum = maxSubArraySum + intArray[j];
                maxArray[count++] = maxSubArraySum;
            }
        }
        return Arrays.copyOf(maxArray,count);
    }
}
