package com.brainstrom.array;

import java.util.Arrays;

public class RemoveDuplicateFormUnsorted {
    public static void main(String[] args) {
    int [] intArray = new int[] {0,0,1,1,1,2,2,1,3,3,4};
    int length = intArray.length;
    int newLength = removeDuplicate(intArray,length);
    for(int i =0; i < newLength; i++){
        System.out.println(intArray[i]);
    }
    }

    private static int removeDuplicate(int[] intArray, int length) {
        int j = 0;
        Arrays.sort(intArray);
        for(int i = 0; i < length-1; i++){
            if(intArray[i] != intArray[i+1]){
                intArray[j++] =intArray[i];
            }
        }
        intArray[j++] = intArray[length-1];
        return j;
    }
}
