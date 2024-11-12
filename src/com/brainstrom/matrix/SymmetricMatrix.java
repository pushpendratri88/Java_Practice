package com.brainstrom.matrix;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {2, 5, 4}, {3, 4, 6} };
        boolean isSymmetric = true;

        // Checking symmetry
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        // Printing the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
