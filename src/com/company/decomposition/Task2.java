package com.company.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

import com.company.util.Util;

public class Task2 {

    public static void calculateNod(int a, int b, int c, int d) {
        int nodAB = Task1.getNod(a, b);
        int nodCD = Task1.getNod(c, d);

        int nod = Task1.getNod(nodAB, nodCD);
        Util.print(nod);
    }
}
