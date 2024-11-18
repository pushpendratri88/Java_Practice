package com.brainstrom.datastructure.array;

import java.util.Arrays;

public class Best2Score {
    public static void main(String[] args) {
        int[] array = {84,86,75,21,94,77,65,98};
        bestScore(array);
        System.out.println(Arrays.toString(bestScore(array)));
    }

    private static int[] bestScore(int[] array) {
        int bestScore = Integer.MIN_VALUE;
        int secondBestScore = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
          if(bestScore < array[i]){
              secondBestScore = bestScore;
             bestScore = array[i];
          }
          else if(array[i] < bestScore && array[i] > secondBestScore){
              secondBestScore = array[i];
          }
        }
        return new int[]{bestScore,secondBestScore};

    }
}
