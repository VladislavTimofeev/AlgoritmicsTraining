package com.company.array;

// На каждое задание новый файл
// использовать util для вывода на экран

public class Main {

    public static void main(String[] args) {
        // write your code here
//        { //Task 1
//            int[] numbers = new int[]{2, 4, 5, 7};
//
//            int sum = Task1.getSumElementsMultipleK(numbers, 2);
//
//            Util.print(String.valueOf(sum));
//        }
//        Util.print("--------------------------------------------Task1-------");
//
//        { // Task2
//            double[] numbers = new double[]{2.3, 3.1, 4.8, 5.9, 6.4};
//
//            int replaceNumbers = Task2.changeElementsMoreZ(numbers, 4.1);
//            Util.print(String.valueOf(replaceNumbers));
//
//        for (int i = 0; i<numbers.length;i++){
//            Util.print(String.valueOf(numbers[i]));
//        }
//            for (double printArray : numbers) {
//                Util.print(String.valueOf(printArray));
//            }
//        }
//        Util.print("--------------------------------------------Task2-------");
//
//        { //Task3
//            double[] numbers = new double[]{3.3, 7.5, 4.1, 0.0, -2.9, -5.4};
//
//            Task3.getCountOfNegativePositiveZeroElements(numbers);
//        }
//        Util.print("--------------------------------------------Task3-------");
//
//        { //Task4
//            double[] numbers = new double[]{-8, 3.3, 7.5, 4.1, 0.0, -2.9, -5.4};
//
//            for (int i = 0; i < numbers.length; i++) {
//                Util.print(String.valueOf(numbers[i]));
//            }
//
//            Util.print("--------------------------------------------Task4-------");
//
//            Task4.changeMaxMin(numbers);
//
//            for (int i = 0; i < numbers.length; i++) {
//                Util.print(String.valueOf(numbers[i]));
//            }
//
//
//        }
//        Util.print("--------------------------------------------Task4-------");
//
//        { //Task5
//            int[] array = new int[]{2, 4, 5, -7, 11, 0};
//            Task5.printSomeElementsArray(array);
//        }
//        Util.print("--------------------------------------------Task5-------");
//
//        double[] numbers = new double[]{2, 4, 6, 8, 1, 3, 4, 7};
//
//        double sum = Task6.findSumSimpleNumbers(numbers);
//        Util.print(String.valueOf(sum));
//        double[] numbers = new double[]{1, 2, 3, 4, 5, 6, 7};
//
//        for (int i = 0; i < numbers.length; i++) {
//            double sum = numbers[i] + numbers[i + 1];
//
//            System.out.println(sum);
//        }
//        Util.print("--------------------------------------------Task6-------");
//
//        double[] numbers = new double[]{2, 4, 6, 8, 1, 3, 4, 7, 9};
//        double maxValueNumbers = Task7.findMaxSumTwoElements(numbers);
//        Util.print(String.valueOf(maxValueNumbers));
//
//        Util.print("--------------------------------------------Task7-------");

//        int[] array = new int[]{5, 3, -9, 11, 32, -9, 0, -6, 12, 18};
//        int[] num = Task8.createNewArrayRemoveMinElements(array);
//        Util.print(Arrays.toString(num));

        int[] array = new int[]{2, 2, 9, 7, 0, 1, 4, 7, 3, 7, 2, 7};

        int result = Task9.findFrequentNumber(array);

        System.out.println(result);


    }
}
