package com.mluch.javastart.lesson7.pracrik;

import java.util.Arrays;

public class RangeFinder {
    public static void main(String[] args) {

        double[] shapes = {150, 50, 120};
        double minShape = 100;
        double maxShape = 200;

        double[] res = shapesFromRange(shapes, minShape, maxShape);
        System.out.println(Arrays.toString(res));


    }

    public static double[] shapesFromRange(double[] shapes, double minShape, double maxShape) {
        if (minShape > maxShape) {
            throw new IllegalArgumentException("minShape > maxShape" + minShape);
        }
        int s = 0;
        for (double elem : shapes) {
            if (elem >= minShape && elem <= maxShape) {
                s++;
            }
        }

        double[] array = new double[s];
        int s1 = 0;
        for (double elem : shapes) {
            if (elem >= minShape && elem <= maxShape) {
                array[s1] = elem;
                s1++;
            }
        }
        return array;
    }
}
