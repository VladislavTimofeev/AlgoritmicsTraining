package com.company.arrays;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {

    /**
     * Метод - findBigElements
     * Метод - changeOddElementsToBig
     * Тип - void
     * Параметры - int[][]
     */

    private static int findMaxElements(int[][] matrix) {


        int max = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;

    }

    public static void changeOddElementsToMax(int[][] matrix) {

        int max = findMaxElements(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
    }


}
