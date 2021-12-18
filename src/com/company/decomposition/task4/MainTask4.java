package com.company.decomposition.task4;

public class MainTask4 {
    public static void main(String[] args) {

//        Point point1 = new Point(2, 3);
//        Point point2 = new Point(3, 7);
//        Point point3 = new Point(7, 10);
//        Point point4 = new Point(10, 6);

        Point[] points = Task4.getScanUserPoints();
        //Point[] points = new Point[]{point1, point2, point3, point4};
        Task4.findDistanceBetweenTwoPoints(points);
    }
}
