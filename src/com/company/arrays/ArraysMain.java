package com.company.arrays;

import com.company.util.Util;

public class ArraysMain {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {-10, 6, 8, -5, 7},
                {5, -7, 8, 9, 4},
                {6, 0, -7, 8, 11},
                {-5, 7, 2, -7, 0},
                {8, -4, 2, -1, 8}
        };

        //int[][] matrix = new int[5][5];

        //Task1.printOddColumnsFirstMoreLast(matrix);
        //Task2.printDiagonalElements(matrix);
        //Task3.printAnyLineAndColumn(matrix,1,4);
        //Task4.creatingMatrixByReference(matrix, 6);
        //Task5.creatingMatrixByReferenceNumberTwo(matrix,6);
        //Task6.creatingMatrixByReferenceNumberThree(matrix,6);
        //Task7.createMatrixByRule(matrix,4);
        //int findElements = Task7.findPositiveElements(matrix);
        //Util.print(findElements);
        //Task8.changePlaceColumns(matrix);
        //Task9.findSumEveryColumn(matrix);
        //Task10.findPositiveElementsByDiagonal(matrix);

        //Task11.createMatrixByRandom(matrix);
        //Util.printArray2D(matrix);
        //Task11.findNumberInLine(matrix);

        //Task12.sortLineMatrixMinToMax(matrix);
        //Task12.sortLineMatrixMaxToMin(matrix);

        //Task13.sortColumnsMatrixMinToMax(matrix);
        //Task13.sortColumnsMatrixMaxToMin(matrix);

        //Task14.createMatrixByZeroAndOne(matrix,5,5);

        Task15.changeOddElementsToMax(matrix);
        Util.printArray2D(matrix);

    }

}
