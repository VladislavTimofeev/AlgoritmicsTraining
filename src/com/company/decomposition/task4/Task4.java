package com.company.decomposition.task4;

// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

import com.company.util.Util;

public class Task4 {

    public static void findDistanceBetweenTwoPoints(Point[] points) {

//        double maxDistance = 0;
//        for (int i = 0; i < points.length - 1; i++) {
//            Point a = points[i];
//            Point b = points[i + 1];
//
//            double pointX = Math.abs(a.getX() - b.getX());//bx - ax;
//            double pointX2 = Math.pow(pointX, 2);
//
//            double pointY = Math.abs(a.getY() - b.getY());
//            double pointY2 = Math.pow(pointY, 2);
//
//            double sumXandY = pointX2 + pointY2;
//            double distance = Math.sqrt(sumXandY);
//
//            if (maxDistance < distance) {
//                maxDistance = distance;
//            }
//            System.out.println("Расстояние равно " + distance);
//        }
//        System.out.println("maxDistance = " + maxDistance);

        double maxDistance = 0;
        for (int i = 0; i < points.length; i++) {
            Point a = points[i];
            for (int j = i; j < points.length - 1; j++) {
                    Point b = points[j + 1];

                    double pointX = Math.abs(a.getX() - b.getX());//bx - ax;
                    double pointX2 = Math.pow(pointX, 2);

                    double pointY = Math.abs(a.getY() - b.getY());
                    double pointY2 = Math.pow(pointY, 2);

                    double sumXandY = pointX2 + pointY2;
                    double distance = Math.sqrt(sumXandY);

                    if (maxDistance < distance) {
                        maxDistance = distance;
                    }
                    System.out.println("Расстояние равно " + distance);

            }

        }
        System.out.println("maxDistance = " + maxDistance);

    }

    public static Point[] getScanUserPoints() {
        int pointCount = Util.scanInt("Enter point count ");
        if (pointCount % 2 != 0) {
            throw new RuntimeException("PointCount should be % 2 ");
        }
        Point[] points = new Point[pointCount];

        for (int i = 0; i < pointCount; i++) {
            System.out.println("Enter for " + i + " point");
            double x = Util.scanDouble("Enter x ");
            double y = Util.scanDouble("Enter y ");
            Point point = new Point(x, y);
            points[i] = point;
        }

        return points;
    }


}
