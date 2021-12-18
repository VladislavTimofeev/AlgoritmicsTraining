package com.company.decomposition;

import com.company.util.Util;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */

public class Task3 {

    /**
     * Площадь треугольника - Sтр = (a*a*корь из 3)/4
     * Площадь правильного шестиугольника  = S = 6*Sтр
     */

    public static double areaOfTriangle(double a) {
        double s = Math.sqrt(3);

        double sTriangle = ((a * a) * s) / 4;

        return sTriangle;
    }

    public static void regularHexagon(double a) {

        double triangle = areaOfTriangle(a);

        double sRegularHexagon = 6 * triangle;

        Util.print("Площадь правильного шестиугольника равна " + sRegularHexagon);
    }

}
