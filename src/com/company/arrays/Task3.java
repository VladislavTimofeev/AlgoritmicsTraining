package com.company.arrays;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task3 {

    /**
     * Метод printAnyLineAndColumn
     * Тип - void
     * Параметры - int[][] matrix
     * вывести у матрицы 2 строку и 3 столбец  5, 7, 8, 9, 4;     8 8 7 2 2
     */

    public static void printAnyLineAndColumn(int[][] matrix, int k, int p) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[k - 1][i] + " ");
        }
        System.out.println();

        for (int j = 0; j < matrix.length; j++) {

            System.out.print(matrix[j][p - 1] + " ");
        }

    }
}
