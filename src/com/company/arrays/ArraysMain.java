package com.company.arrays;

import com.company.util.Util;

public class ArraysMain {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {10, 6, 8, 5, 7},
                {5, 7, 8, 9, 4},
                {6, 0, 7, 8, 11},
                {5, 7, 2, 7, 0},
                {8, 4, 2, 1, 7}
        };
        //double[][] matrix = new double[4][4];

        //Task1.printOddColumnsFirstMoreLast(matrix);
        //Task2.printDiagonalElements(matrix);
        //Task3.printAnyLineAndColumn(matrix,1,4);
        //Task4.creatingMatrixByReference(matrix, 6);
        //Task5.creatingMatrixByReferenceNumberTwo(matrix,6);
        //Task6.creatingMatrixByReferenceNumberThree(matrix,6);
        //Task7.createMatrixByRule(matrix,4);
        //int findElements = Task7.findPositiveElements(matrix);
        //Util.print(findElements);
        Task8.changePlaceColumns(matrix);

        for (int[] mat : matrix){
            for (int ma : mat){
                System.out.print(ma + "\t");
            }
            System.out.println();
        }

    }

}
