package com.brainstrom.DataStructure.Array;

import java.util.Arrays;

public class FindTopTwoScores {
    public static void main(String[] args) {
        int[] scores = new int[]{84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(scores)));
    }

    public static int[] findTopTwoScores(int[] array){
        int[] bestScoreArray = new int[2];
        bestScoreArray[0]=array[0];
        for(int i = 1; i < array.length; i++){
            if(bestScoreArray[0] < array[i]){
                bestScoreArray[1] = bestScoreArray[0];
                bestScoreArray[0] = array[i];
            }
        }
        return bestScoreArray;
    }
}
