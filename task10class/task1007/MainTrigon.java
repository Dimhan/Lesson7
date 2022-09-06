package com.epamjavaweb.task10class.task1007;

public class MainTrigon {
    public static void main(String[] args) {
        Trigon trigon = new Trigon(9, 8, 2);
        System.out.println("Perimeter");
        System.out.printf("%5.3f\n", trigon.perimetr());
        System.out.println("Square");
        System.out.printf("%5.3f\n", trigon.squareTr());
        System.out.println("Median intersection point");
        System.out.printf("%5.3f\n", trigon.crossMedian());
    }
}
