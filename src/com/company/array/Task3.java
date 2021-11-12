package com.company.array;

import com.company.util.Util;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */

public class Task3 {

    /**
     * Метод - getCountOfNegativePositiveZeroElements
     * тип - int
     * параметры - double[]
     * массив - 3.3  7.5  4.1  0.0  -2.9  -5.4 - Положительные - 3 Нуль - 1 Отрицательные - 2
     */

    public static void getCountOfNegativePositiveZeroElements(double[] numbers) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negative++;
            } else if (numbers[i] > 0) {
                positive++;
            } else {
                zero++;
            }
        }
        Util.print(" Отрицательных элементов : " + negative + "\n Положительных элементов : " + positive + "\n Нулевых элементов : " + zero);
    }

}
