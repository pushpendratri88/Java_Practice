package com.brainstrom.datastructure.array.twopointer;

public class SumTwoPointer {
    public static void main(String [] args){
        int[] intArray = new int[]{2,3,11,7,7,5,4};
        int target = 9;
        System.out.println(findSum(intArray,target));

    }

    public static String findSum(int[] intArray, int target){
        int left = 0;
        int right = intArray.length-1;
        int currentSum = 0;
        while(left < right){
            currentSum = intArray[left] +intArray[right];
            if(currentSum == target){
                return String.valueOf(intArray[left]) +" " + String.valueOf(intArray[right]);
            }
            else if(currentSum < target){
                left++;
            }
            else{
                right--;
            }

        }
        return null;
    }
}
