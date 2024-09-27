//Given a string consisting of various numbers separated by spaces, convert it into an array of Integers,
// such that every number occupies a position in the array, and for every invalid number, there is a -1 in the array.
//
//Example:
//For the String str = “19 46 8999 abc 133”;
//The array will be [19, 46, 8999, -1, 133].

package com.brainstrom.fundamental;

public class ConvertStringToIntegerArray {
    public static void main(String[] args) {
        String str = "19 46 8999 abc 133";
        int[] resultArray = stringToIntegerArray(str); 
        for(int i=0; i < resultArray.length;i++){
            System.out.println(resultArray[i]);
        }
    }

    private static  int[] stringToIntegerArray(String str) {
        String[] stringArray = str.split(" ");
        int[] intArray = new int[stringArray.length];
        for(int i=0; i < intArray.length;i++){
            try{
                intArray[i] =  Integer.parseInt(stringArray[i]);
            }
            catch (Exception e){
                intArray[i] = -1;
            }
        }
        return intArray;

    }
}
