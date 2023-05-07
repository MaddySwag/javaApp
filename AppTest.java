import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(0, Calculator.add(0, 0));
        assertEquals(-2, Calculator.add(-1, -1));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, Calculator.subtract(2, 3));
        assertEquals(0, Calculator.subtract(0, 0));
        assertEquals(1, Calculator.subtract(-1, -2));
    }
}
