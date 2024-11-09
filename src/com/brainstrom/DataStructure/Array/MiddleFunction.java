package com.brainstrom.DataStructure.Array;

public class MiddleFunction {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4};
        int[] resultArray = middle(intArray);
        for (int element :resultArray){
            System.out.println(element);
        }
    }

    public static int[] middle(int[] array) {
        int[] midArray = new int[array.length-2];
        int midArrayCount = 0;

        for(int i=1; i < array.length-1; i++){
            midArray[midArrayCount] = array[i];
            midArrayCount++;
        }

        return midArray;
    }

}
