package com.company.array;

/**
 * Дана последовательность целых чисел a1,a2,a3.....an. Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1,a2,a3.....an)
 */

public class Task8 {

    /**
     * Метод - createNewArrayRemoveMinElements
     * тип - int
     * параметры - int[] array
     * <p>
     * дан массив - 5, 3, 9, 11, 32, 0, -6, 12, 18
     * Выбрасываю минимальный элемент - -6
     * Получаю новую последовательность 5, 3, 9 11, 32, 0, 12, 18
     */

    public static int[] createNewArrayRemoveMinElements(int[] array) {
        int min = 0;
        int minCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }

        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }

        int[] result = new int[array.length - minCount];

        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }

        return result;
    }

}
