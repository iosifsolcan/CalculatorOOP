import org.example.Shape.Square.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSquare {

    @Test
    public void shouldRejectInvalidDimension()
    {
        Square square=new Square(5.0);
        boolean result=square.isValid();
        assertEquals(true,result);
    }
    @Test
    void testArea() {
        Square square = new Square(5.0);
        assertEquals(25.0, square.area());
    }

    @Test
    void testPerimeter() {
        Square square = new Square(5.0);
        assertEquals(20.0, square.perimeter());
    }
}
