package com.company.arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task4 {

    /**
     * Метод - creatingMatrixByReference
     * Тип - void
     * Параметры - int[][] matrix
     * <p>
     * Задается число n = 6;
     * создаю матрицу по n строк и n столбцов
     */

    public static void creatingMatrixByReference(int[][] matrix, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) {
                    matrix[i][j] = n - j;
                } else {
                    matrix[i][j] = j + 1;
                }

            }

        }

    }
}
