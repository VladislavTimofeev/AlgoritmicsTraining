package com.company.arrays;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Task1 {

    /**
     * Метод - printOddColumnsFirstMoreLast
     * Тип - void
     * Параметры - int[][]  array
     * {1, 6, 8, 5, 4, 0, 3},
     * {5, 7, 8, 9, 4, 2, 1},
     * {6, 0, 7, 8, 1, 2, 5},
     * {5, 7, 2, 7, 5, 2, 1}
     * Надо вывести НЕЧЕТНЫЕ столбцы, у которых первый элемент больше последнего.
     */

    public static void printOddColumnsFirstMoreLast(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
