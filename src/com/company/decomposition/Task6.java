package com.company.decomposition;

//  Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import com.company.util.Util;

public class Task6 {

    public static void calculateNodThreeNumb(int a, int b, int c) {
        int nodAB = Task1.getNod(a, b);
        int nod = Task1.getNod(nodAB, c);

        if (nod==1){
            Util.print("Введенные вами числа являются взаимно-простыми!");
        } else {
            Util.print("Числа не являются взаимно-простыми!");
        }

    }

}
