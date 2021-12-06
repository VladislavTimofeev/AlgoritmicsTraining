package com.company.arrays;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {

    /**
     * Метод - findPositiveElementsByDiagonal
     * Тип - void
     * Парамерты - int[][]
     */

    public static void findPositiveElementsByDiagonal(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.println("Положительный элемент диагонали : " + matrix[i][i]);
            }

        }
        System.out.println(" ");
    }

}
