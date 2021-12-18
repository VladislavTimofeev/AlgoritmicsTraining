package com.company.decomposition;

import com.company.util.Util;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел:
 */

public class Task1 {

    /**
     * Метод 1 - нахождение НОД 2-х чисел - findNod
     * Метод 2 - нахождение НОК 2-х чисел - findNok
     * Тип - void
     * Параметры - int a,b
     */

    public static int getNod(int a, int b) {

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }

        }
        return a + b;
    }

    public static int getNok(int a, int b) {
        int nod = getNod(a, b);

        int nok = (a * b) / nod;

        return nok;
    }

    public static void getNokAndNod(int a, int b) {

        int nod = getNod(a, b);
        int nok = getNok(a, b);

        Util.print("НОД ваших чисел равен " + nod);
        Util.print("НОК ваших чисел равен " + nok);
    }
}
