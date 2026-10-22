import org.example.Shape.Rectangle.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {

    @Test
    public void shouldRejectInvalidDimensions()
    {
        Rectangle rectangle=new Rectangle(5.0,4.0);
        boolean result=rectangle.isValid();
        assertEquals(true,result);
    }

    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(3.0, 5.0);

        assertEquals(15, rectangle.area());
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        assertEquals(18.0, rectangle.perimeter());
    }

}
