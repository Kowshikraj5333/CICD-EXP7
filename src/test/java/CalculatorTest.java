import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calculator c = new Calculator();
        assertEquals(2, c.subtract(5, 3));
    }
}
