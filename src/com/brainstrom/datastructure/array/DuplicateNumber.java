package com.brainstrom.datastructure.array;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString( removeDuplicates(intArray)));

    }
    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArray = new int[arr.length];
        int newCount = 0;
        for(int i = 0; i < arr.length; i++){
            boolean duplicate = false;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                uniqueArray[newCount++] = arr[i];
            }
        }
        return Arrays.copyOf(uniqueArray,newCount);

    }
}
