package com.brainstrom.matrix;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{6,4,5},{2,3,1},{8,9,7}};
        int[][] resultMatrix = new int[3][3];

        for(int row=0; row < matrix1.length; row++){
            for(int col=0; col < matrix1[row].length; col++){
            resultMatrix [row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }

       for(int[] row : resultMatrix){
           for(int element : row){
               System.out.print(element + "|");
           }
           System.out.println();
       }


    }
}
