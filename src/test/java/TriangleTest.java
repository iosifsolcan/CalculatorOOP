import org.example.Shape.Circle.Circle;
import org.example.Shape.Triangle.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    void testArea() {
        Triangle triangle = new Triangle(4, 4, 4);
        assertEquals(6.928203230275509, triangle.area());
    }

    @Test
    void testAreaGeneralTriangle() {
        Triangle triangle = new Triangle(5, 5, 6);
        assertEquals(12, triangle.area());
    }

    @Test
    void testPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.perimeter());
    }


    @Test
    void testIsValid() {
        Triangle triangle = new Triangle(4, 4, 4);
        boolean result=triangle.isValid();
        assertEquals(true,result);
    }

}
