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

        double max = 0;
        double min = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        Util.print("Max = " + max + "\nMin = " + min);

    }
}
