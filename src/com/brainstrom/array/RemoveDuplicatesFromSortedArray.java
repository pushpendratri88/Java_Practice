package com.brainstrom.array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array =  new int[] {0,0,1,1,1,2,2,3,3,4};
        int length = array.length;
        length = removeDuplicates(array, length);
        // Print the unique elements
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int removeDuplicates(int[] array, int length) {
        if (length == 0 || length == 1) {
            return length;
        }

        // New index of the non-duplicate element
        int j = 0;

        // Traverse the array
        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }

        // Store the last element as whether it is unique or repeated, it hasn't been stored previously
        array[j++] = array[length - 1];

        return j;
    }

}
