import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

    @Test
    void testAddition() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(5, calc.add(2, 3));   // First example
        assertEquals(10, calc.add(7, 3));  // Second example
    }
}
