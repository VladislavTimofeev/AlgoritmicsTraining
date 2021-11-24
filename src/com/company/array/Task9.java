package com.company.array;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */

public class Task9 {

    /**
     * Метод - findFrequentNumber
     * Тип - int
     * Параметры - int[] array
     * <p>
     * Массив - 2,2,9,7,0,1,4,7,3,7,2
     * Повторяются числа 2 и 7, ищу их, потом сравниваю и вывожу меньшее из них, то есть ответ будет 2.
     * Посчитать сколько раз встречается каждый элемент. Храню это число и читаю сколько раз оно встретилось.
     */

    public static int findFrequentNumber(int[] array) {
        /**
         * Посчитать сколько раз каждое число встречается в массиве.
         * Из всех этих чисел выбрать наиболее часто встречаемое число.
         * Из этих чисел надо выбрать миниманьное число.
         *
         * 1  , one
         * key,value
         */

        //Map<Integer, Integer> numberAppearances = new HashMap<>();
        int number = 0; // Число в массиве
        int count = 0; // Количество раз сколько повторилось число
        for (int i = 0; i < array.length; i++) {
            if (number != array[i]) {
                int currentCount = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == array[i]) {
                        currentCount++;
                    }
                }

                if (currentCount > count) {
                    count = currentCount;
                    number = array[i];
                } else if (count == currentCount) {
                    number = Math.min(number, array[i]);
                }
            }
        }

        return number;
    }


}
