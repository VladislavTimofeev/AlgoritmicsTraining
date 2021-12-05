package com.company.arrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):


public class Task6 {

    public static void creatingMatrixByReferenceNumberThree(int[][] matrix, int n) {


        for (int i = 0; i < n; i++) {

            if (i == 0 || i == n - 1) { // always 1
                for (int j = 0; j < n; j++) {
                    System.out.print(1 + "\t");
                }
            } else if (i == 1 || i == n - 2) { //  0	1	1	1	1	0
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1) {
                        System.out.print(0 + "\t");
                    } else {
                        System.out.print(1 + "\t");
                    }
                }
            } else { // 0	0	1	1	0	0
                for (int j = 0; j < n; j++) {
                    if (j == 0 ||
                            j == 1
                            || (j - n) + 1 == 0 || (j - n) + 2 == 0) {
                        System.out.print(0 + "\t");
                    } else {
                        System.out.print(1 + "\t");
                    }
                }
            }

            System.out.println();
        }
    }
}
