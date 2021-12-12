package com.company.arrays;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {

    /**
     * Метод 1 - sortColumnsMatrixMinToMax
     * Метод 2 - sortColumnsMatrixMaxToMin
     * Тип - void
     * Параметры - int[][]
     */

    public static void sortColumnsMatrixMinToMax(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length - 1; k++) {
                    if (matrix[k][j] > matrix[k+1][j]) {
                        int tmp = matrix[k][j];
                        matrix[k][j] = matrix[k+1][j];
                        matrix[k+1][j] = tmp;
                    }
                }
            }
        }
    }

    public static void sortColumnsMatrixMaxToMin(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length - 1; k++) {
                    if (matrix[k][j] < matrix[k+1][j]) {
                        int tmp = matrix[k][j];
                        matrix[k][j] = matrix[k+1][j];
                        matrix[k+1][j] = tmp;
                    }
                }
            }
        }
    }

}
