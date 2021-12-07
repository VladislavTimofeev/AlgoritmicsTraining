package com.company.arrays;

import java.util.Random;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */

public class Task11 {

    /**
     * Метод - findNumberInLine
     * Тип - void
     * Параметры - int[][]
     */

    public static void createMatrixByRandom(int[][] matrix) {

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(15);
            }
        }
    }

    public static void findNumberInLine(int[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("Номер строки, в торой 5 встречается 3 и более раз ------ " + (++i));
            }

        }
    }
}
