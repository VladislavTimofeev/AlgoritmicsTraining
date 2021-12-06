package com.company.arrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task9 {

    /**
     * Метод - findSumEveryColumn
     * Тип - void
     * Парамерты - int[][]
     */

    public static void findSumEveryColumn(int[][] matrix) {

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                count += matrix[j][i];
            }
            sum = Math.max(sum, count);

        }
        System.out.println(sum);
    }
}
