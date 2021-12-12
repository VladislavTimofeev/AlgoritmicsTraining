package com.company.arrays;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {

    /**
     * Метод 1 - sortLineMatrixMinToMax
     * Метод 2 - sortLineMatrixMaxToMin
     * Тип - void
     * Параметры - int[][]
     */

    public static void sortLineMatrixMinToMax(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int b = 0; b < matrix[i].length - j - 1; b++) {
                    if (matrix[i][b] > matrix[i][b + 1]) {
                        int tmp = matrix[i][b];
                        matrix[i][b] = matrix[i][b + 1];
                        matrix[i][b + 1] = tmp;
                    }
                }

            }

        }
    }

    public static void sortLineMatrixMaxToMin(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int b = 0; b < matrix[i].length - j - 1; b++) {
                    if (matrix[i][b] < matrix[i][b + 1]) {
                        int tmp = matrix[i][b];
                        matrix[i][b] = matrix[i][b + 1];
                        matrix[i][b + 1] = tmp;
                    }
                }

            }

        }
    }

}
