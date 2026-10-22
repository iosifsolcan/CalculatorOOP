package org.example.Calculator;

import org.example.Shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        if (shape == null || !shape.isValid()) {
            System.out.println("Invalid shape!");
            return;
        }
        shapes.add(shape);
    }

    public double totalArea() {
        double total = 0;

        for (Shape shape : shapes) {
            total += shape.area();
        }

        return total;
    }

    public double totalPerimeter() {
        double total = 0;

        for (Shape shape : shapes) {
            total += shape.perimeter();
        }

        return total;
    }

}
