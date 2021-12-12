package com.company.arrays;


/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */

public class Task14 {

    /**
     * Метод - createMatrixByZeroAndOne
     * Тип - void
     * Параметры - int[][]
     */

    public static void createMatrixByZeroAndOne(int[][] matrix, int n, int m) {


        for (int j = 0; j < m; j++) {
            int count = 0; // количество единиц которое я вставил
            for (int i = 0; i < n; i++) {
                if (j >= count) {
                    matrix[i][j] = 1;
                    count++;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
    }


}
