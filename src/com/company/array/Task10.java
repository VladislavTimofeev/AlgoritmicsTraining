package com.company.array;

/**
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task10 {

    /**
     * Метод - ShrinkArrayRemoveSecondElements
     * Тип - int
     * Параметры - int[] array
     * Массив - 4,8,0,2,5,3,1,7,10,12
     * <p>
     * Мне надо выбросить каждый 2-й элемент, и заменить их на 0, на выходе имею массив : 4,0,0,0,5,0,1,0,10,0
     */

    public static int[] ShrinkArrayRemoveSecondElements(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        return array;
    }

}
