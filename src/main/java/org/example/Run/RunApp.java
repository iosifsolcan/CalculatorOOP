package org.example.Run;

import org.example.Calculator.Calculator;
import org.example.Shape.Circle.Circle;
import org.example.Shape.Rectangle.Rectangle;
import org.example.Shape.Square.Square;
import org.example.Shape.Triangle.Triangle;

public class RunApp {

    public void runApp() {
        Rectangle rectangle=new Rectangle(5.0,3.0);
        if(rectangle.isValid())
        {
            System.out.println("Rectangle area --> "+rectangle.area());
            System.out.println("Rectangle perimeter -->"+rectangle.perimeter());
        }
        else
            System.out.println("Width or height are incorrect!");
        Square square=new Square(4.5);
        if(square.isValid())
        {
            System.out.println("Square area --> "+square.area());
            System.out.println("Square perimeter --> "+square.perimeter());
        }
        else
            System.out.println("The side is incorrect!");

        Circle circle=new Circle(16);
        if(circle.isValid())
        {
            System.out.println("Circle area --> "+circle.area());
            System.out.println("Circle perimeter --> "+circle.perimeter());
        }
        else
            System.out.println("The radius is incorrect!");

        Triangle triangle=new Triangle(5,5,5);
        if(triangle.isValid())
        {
            System.out.println("Triangle area --> "+triangle.area());
            System.out.println("Triangle perimeter --> "+triangle.perimeter());
        }
        else
            System.out.println("The sides are incorrect!");

       Calculator calculator = new Calculator();

        calculator.addShape(new Rectangle(5.0, 3.0));
        calculator.addShape(new Square(4.5));
        calculator.addShape(new Circle(16));
        calculator.addShape(new Triangle(5, 5, 5));

        System.out.println("Total area: "
                + calculator.totalArea());
        System.out.println("Total perimeter: "
                + calculator.totalPerimeter());
    }
}
