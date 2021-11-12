package com.company.array;

import com.company.util.Util;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task5 {

    /**
     * метод - printSomeElementsArray
     * тип - int
     * параметры - int[]
     * массив - 2 4 5 -7 11 0                      должно вывести : 2 4 5 11
     */

    public static void printSomeElementsArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i]>i){
                System.out.println(array[i]);
            }
        }
    }

}
