package com.company.array;

import com.company.util.Util;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Task6 {

    /**
     * Метод - findSumSimpleNumbers
     * Тип - double
     * Параметры метода - double[]
     * 3.3  7.5  4.1  0.0  -2.9  -5.4      сумма чисел, порядкое номера которых простые числа : 7.5 + 0.0 +  -5.4 = 2.1
     */

    public static double findSumSimpleNumbers(double[] array) {

        double sum = 0;

        for (int i = 1; i < array.length; i++) {
            boolean isSimple = true;

            for (int j = 2; j <= i / 2; j++) {
                int temp = i % j;
                if (temp == 0) {
                    isSimple = false;
                    break;
                }
            }

            if (isSimple) {
                sum += array[i];
            }

        }
        return sum;
    }


}
