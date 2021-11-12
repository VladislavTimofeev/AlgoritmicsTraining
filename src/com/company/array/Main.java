package com.company.array;

// На каждое задание новый файл
// использовать util для вывода на экран

import com.company.util.Util;

public class Main {

    public static void main(String[] args) {
        // write your code here
        { //Task 1
            int[] numbers = new int[]{2, 4, 5, 7};

            int sum = Task1.getSumElementsMultipleK(numbers, 2);

            Util.print(String.valueOf(sum));
        }
        Util.print("--------------------------------------------Task1-------");

        { // Task2
            double[] numbers = new double[]{2.3, 3.1, 4.8, 5.9, 6.4};

            int replaceNumbers = Task2.changeElementsMoreZ(numbers, 4.1);
            Util.print(String.valueOf(replaceNumbers));

//        for (int i = 0; i<numbers.length;i++){
//            Util.print(String.valueOf(numbers[i]));
//        }
            for (double printArray : numbers) {
                Util.print(String.valueOf(printArray));
            }
        }
        Util.print("--------------------------------------------Task2-------");

        { //Task3
            double[] numbers = new double[]{3.3, 7.5, 4.1, 0.0, -2.9, -5.4};

            Task3.getCountOfNegativePositiveZeroElements(numbers);
        }
        Util.print("--------------------------------------------Task3-------");

        { //Task4
            double[] numbers = new double[]{3.3, 7.5, 4.1, 0.0, -2.9, -5.4};
            Task4.changeMaxMin(numbers);
        }
        Util.print("--------------------------------------------Task4-------");

        { //Task5
            int[] array = new int[]{2, 4, 5, -7, 11, 0};
            Task5.printSomeElementsArray(array);
        }
        Util.print("--------------------------------------------Task5-------");
    }
}
