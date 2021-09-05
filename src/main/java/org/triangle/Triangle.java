package org.triangle;

public class Triangle {

    public static double area(int a, int b, int c) {
        int p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
