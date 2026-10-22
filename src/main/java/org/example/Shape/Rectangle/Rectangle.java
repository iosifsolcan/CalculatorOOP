package org.example.Shape.Rectangle;

import org.example.Shape.Shape;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * height + 2 * width;
    }

    @Override
    public boolean isValid() {
        if (height > 0 && width > 0)
            return true;
        else
            return false;
    }
}
