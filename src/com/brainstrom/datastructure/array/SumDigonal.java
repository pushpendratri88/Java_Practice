package com.brainstrom.datastructure.array;

public class SumDigonal {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumDigonal(array));
    }

    private static int sumDigonal(int[][] array) {
        int sum = 0;
        for(int i=0 ; i < array.length; i++){
            sum = sum + array[i][i];
        }
        return sum;
    }
}
