package com.company.array;

/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */

public class Task2 {
    /**
     * метод - changeElementsMoreZ
     * тип - int
     * параметры метода - double[] numbers, double z
     * 2.3   3.1   4.8   5.9   6.4 - массив, z = 4.1 -  заменяю элементы которые больше Z этим числом - 2.3  3.1  4.1  4.1  4.1
     * Количество замен - 3
     */

    public static int changeElementsMoreZ(double[] numbers, double z) {
        int replace = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > z) {
                numbers[i] = z;
                replace++;
            }
        }
        return replace;
    }
}
