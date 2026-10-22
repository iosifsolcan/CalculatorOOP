package org.example.Shape.Triangle;

import org.example.Shape.Shape;

public class Triangle extends Shape {
    private int a,b,c;
    public Triangle(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public boolean isValid() {
        return a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a;
    }
}
