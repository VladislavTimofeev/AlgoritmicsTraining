package com.company.arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task5 {

    /**
     * Метод - creatingMatrixByReferenceNumberTwo
     * Тип - void
     * Параметры - int[][] matrix
     * <p>
     * Задается число n = 6;
     * создаю матрицу по n строк и n столбцов согласно условия
     */

    public static void creatingMatrixByReferenceNumberTwo(int[][] matrix, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - (i + j) <= 0) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = i + 1;
                }
            }
        }
    }
}
