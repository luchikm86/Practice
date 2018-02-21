package com.mluch.javastart.lesson7.pracrik;


import java.util.Arrays;


public class AreasCalculator {
    public static void main(String[] args) {


        double[] widths = {10, 30, 50};
        double[] heights = {20, 20, 30};

        double[] sum = rectangleAreas(widths, heights);
        System.out.print(Arrays.toString(sum));

    }

    public static double[] rectangleAreas(double[] widths, double[] heights) {
        if (widths.length != heights.length) {
            throw new IllegalArgumentException("widths.length != heights.length");
        }

        double len = Math.min(widths.length, heights.length);
        double[] res = new double[(int) len];

        for (int i = 0; i < res.length; i++) {
            res[i]= Geometry.rectangleArea(widths[i], heights[i]);
        }

        return res;

    }
}
