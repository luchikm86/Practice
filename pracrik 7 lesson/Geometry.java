package com.mluch.javastart.lesson7.pracrik;


import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        System.out.println(rectangleArea(width, height));

        System.out.print("Enter size circle: ");
        double circle = scanner.nextInt();

        System.out.println(circleArea(circle));

    }
    public static double rectangleArea(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("width or height > to");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height must be > 0");
        }
//        double a = width * height;
//        return a;
          return width * height;

    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("width or height > to");
        }
//        double rad = Math.PI * Math.pow(radius, 2);
//        return rad;
        return Math.PI * Math.pow(radius, 2);
    }

}
