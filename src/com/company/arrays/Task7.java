package com.company.arrays;

// Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней.


public class Task7 {

    /**
     * Метод - createMatrixByRule
     * Тип - void
     * Параметры - int[][]
     */

    public static void createMatrixByRule(double[][] matrix, int n) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                double iAndJ = ((i * i) - (j * j));
                double iDelJ = iAndJ / n;
                double sinIj = Math.sin(iDelJ);
                matrix[i][j] = sinIj;
            }
        }
    }

    public static int findPositiveElements(double[][] matrix) {

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
