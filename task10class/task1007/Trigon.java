package com.epamjavaweb.task10class.task1007;
/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра
и точки пересечения медиан.
 */

public class Trigon {
    private double a;
    private double b;
    private double c;

    public Trigon() {
        a = 5;
        b = 5;
        c = 5;
    }


    public Trigon(double a, double b, double c) {
        double p2 = (a + b + c) / 2; // Find a half-perimeter
        if (a > p2 || b > p2 || c > p2) {
            throw new RuntimeException("Incorrect data");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double perimetr() {
        return a + b + c;
    }

    public double squareTr() {
        double halfP = perimetr() / 2;
        double s = halfP * (halfP - a) * (halfP - b) * (halfP - c);
        return Math.sqrt(s);
    }

    public double crossMedian() {
        double medianA;

//All medians of the triangle intersect at one point and are divided by the intersection point for 2 : 1

        medianA = Math.sqrt(2 * (a * a + b * b) - c * c) / 3; //2 parts of three
        return medianA;
    }

}
