package com.company.arrays;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {

    public static void printDiagonalElements(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(" ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println(" ");

        for (int i = matrix.length - 1; i >= 0; i--) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i <= matrix.length - 1; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
        System.out.println(" ");

        for (int i = matrix.length - 1; i >= 0; i--) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }

    }
}
