package com.mluch.javastart.lesson7.pracrik;



public class AreasSumCalculator {
    public static void main(String[] args) {

       double[] radiuses = {10, 20};

        double res = circleAreasSum(radiuses);
        System.out.println(res);

    }

    public static double circleAreasSum(double[] radiuses) {

        double sum = 0;
        for (double elem : radiuses) {
            sum += Geometry.circleArea(elem);
        }
        return sum;
    }
}


