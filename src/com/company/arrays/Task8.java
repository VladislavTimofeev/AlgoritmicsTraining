package com.company.arrays;

// В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import com.company.util.Util;

public class Task8 {

    /**
     * Метод - changePlaceColumns
     * Тип - void
     * Параметры -  int[][]
     */

    public static void changePlaceColumns(int[][] matrix) {


        int m1 = Util.scanInt("Номер первого столбца: ");
        int m2 = Util.scanInt("Номер второго столбца: ");

        if (m1 > matrix.length || m2 > matrix.length) {
            throw new IllegalArgumentException("Вы вышли за пределы массива");
        }

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][m1 - 1];
            matrix[i][m1 - 1] = matrix[i][m2 - 1];
            matrix[i][m2 - 1] = temp;
        }


    }
}
