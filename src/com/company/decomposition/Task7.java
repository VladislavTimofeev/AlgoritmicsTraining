package com.company.decomposition.task4;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Task7 {

    public static void sumFactorial(long sum) {
        long sumF = 0;
        long factorial = 1;
        for (int i = 1; i <= sum; i++) {
            factorial *= i;
            if (i % 2 != 0) {
                sumF += factorial;
            }
        }
        System.out.println(sumF);
    }
}
