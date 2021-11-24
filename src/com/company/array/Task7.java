package com.company.array;

/**
 * findMaxSumTwoElements
 * Тип double
 * Параметры - double[]
 * <p>
 * Дан массив  1,2,3,4,5,6,7
 * 1+2 = 3
 * 2+3 = 5
 * 3+4 = 7
 * 4+5 = 9
 * 5+6 = 11
 * 6+7 = 13
 */

public class Task7 {

    public static double findMaxSumTwoElements(double[] array) {

        double max = array[0] + array[1];

        for (int i = 1; i < array.length - 1; i++) {
            double sum = array[i] + array[i + 1];
            System.out.println(sum);
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

}
