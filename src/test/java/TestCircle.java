import org.example.Shape.Circle.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCircle {

    @Test
    void testArea() {
        Circle circle = new Circle(4);
        assertEquals(Math.PI * 16, circle.area());
    }

    @Test
    void testPerimeter() {
        Circle circle = new Circle(4);
        assertEquals(2 * Math.PI * 4, circle.perimeter());
    }

    @Test
    void testIsValid() {
        Circle circle = new Circle(4);
        boolean result=circle.isValid();
        assertEquals(true,result);
    }

}
