package com.brainstrom.interview;

import java.util.Arrays;

public class sortBinaryArray {
    public static void main(String[] args) {
        // Sample array of 0s and 1s
        int[] array = {0, 0, 1, 0, 1, 0, 0, 1};

        // Sort the array with 0s on the left and 1s on the right
        sortBinaryArray(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sortBinaryArray(int[] array) {
    int left = 0;
    int right = array.length-1;

    while(left < right){

        while(array[left] == 0){
            left++;
        }
        while(array[right] == 1){
            right--;
        }

        if(left < right){
            array[left] = 0;
            array[right] = 1;
            left ++;
            right --;
        }
    }
    }
}
