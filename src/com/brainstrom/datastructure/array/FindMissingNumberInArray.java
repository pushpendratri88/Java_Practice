package com.brainstrom.datastructure.array;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] myArray= {1,2,3,4,6};
        System.out.println(findMissingNumberInArray(myArray));
    }

    static int findMissingNumberInArray(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n+1))/2;
        int acctualSum =  0;

        for(int i=0; i< arr.length; i++){
            acctualSum =acctualSum + arr[i];
        }
        return expectedSum - acctualSum;
    }
}
