package com.company.array;

import com.company.util.Util;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task4 {

    /**
     * метод - changeMaxMin
     * тип void
     * параметры   - double[]
     * массив - 3.3  7.5  4.1  0.0  -2.9  -5.4 ,  я должен поменять местами 7.5 и -5.4 макс и мин элементы
     */

    public static void changeMaxMin(double[] array) {

        /**
         * Находим минимальный элемент и его индекс
         * Находим максимальный элемент и его индекс
         * меняю эти 2 элемента местами
         */

        double max = 0;
        double min = 0;
        int indexMax = 0;
        int indexMin = 0;

        max = array[0];
        min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }

        }


        Util.print("max = " + max + " indexMax = " + indexMax);
        Util.print("min = " + min + " indexMin = " + indexMin);

        array[indexMin] = max;
        array[indexMax] = min;

    }


}
