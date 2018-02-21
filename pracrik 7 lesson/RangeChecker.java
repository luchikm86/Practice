package com.mluch.javastart.lesson7.pracrik;

public class RangeChecker {

    public static void main(String[] args) {

        double[] shapes = {150, 50, 35};
        double minShape = 10;
        double maxShape = 200;
        boolean res = isAllInRange(shapes, minShape, maxShape);
        System.out.println(res);
    }

    public static boolean isAllInRange(double[] shapes, double minShape, double maxShape) {
        if (minShape > maxShape) {
            throw new IllegalArgumentException("minShape > maxShape" + minShape);
        }

        for (double elem : shapes) {
            if (elem < minShape || elem > maxShape) {
                return false;
            }
        }
        return true;
    }

}

