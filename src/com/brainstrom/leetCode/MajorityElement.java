package com.brainstrom.leetCode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] intArray = new int[]{3,2,3};
        System.out.println(getMajorityElement(intArray));

    }

    private static int getMajorityElement( int[] intArray) {
        int[] candidateArray = new int[intArray.length];
        int[] countArray = new int[intArray.length];
        int count = 0;
        int j = 0;
        int k = 0;
        Arrays.sort(intArray);
        for (int i=0; i< intArray.length; i++){
            if(count ==0){
                candidateArray[j] = intArray[i];
                count++;
            }
            else if(candidateArray[j] == intArray[i]){
                count++;
            }
            else if (candidateArray[j] != intArray[i]){
                countArray[k++] = count;
                j++;
                count = 0;
                if(count ==0){
                    candidateArray[j] = intArray[i];
                    count++;
                }
            }
        }
        countArray[k++] = count;

        for (int i=0; i< countArray.length; i++){
            if(countArray[i] > intArray.length / 2){
                return candidateArray[i];
            }
        }

        return 0;
    }

}
