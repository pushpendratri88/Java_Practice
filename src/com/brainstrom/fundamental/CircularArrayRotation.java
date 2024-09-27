//Given an array of integers, circularly rotate the elements of the array, by a given value, say n.
//        Example:
//
//int array[] = {1,2,3,4,5}
//n = 3
//output = {3,4,5,1,2}
package com.brainstrom.fundamental;

import java.util.Arrays;
public class CircularArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 3-1; // Number of positions to rotate
        int[] rotatedArray = rotateArray(array, n);

        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }

    public static int[] rotateArray(int[] array, int n) {
        int length = array.length;
        int[] rotatedArray = new int[length];

        // Normalize n to be within the range of the array length
        n = n % length;

        for (int i = 0; i < length; i++) {
            // Calculate the new index using modular arithmetic
            int newIndex = (i + length - n) % length;
            rotatedArray[newIndex] = array[i];
        }

        return rotatedArray;
    }
}
