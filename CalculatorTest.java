import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // Test for Add class
    @Test
    public void testAdd() {
        Calculater addOperation = new Add();
        double result = addOperation.calculate(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    // Test for Subtract class
    @Test
    public void testSubstract() {
        Calculater subtractOperation = new Substract();
        double result = subtractOperation.calculate(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    // Test for Multiply class
    @Test
    public void testMultiply() {
        Calculater multiplyOperation = new Multiply();
        double result = multiplyOperation.calculate(5, 3);
        assertEquals(15, result, "5 * 3 should equal 15");
    }

    // Test for Divide class (valid division)
    @Test
    public void testDivide() {
        Calculater divideOperation = new Divide();
        double result = divideOperation.calculate(6, 2);
        assertEquals(3, result, "6 / 2 should equal 3");
    }

    // Test for Divide class (divide by zero - should throw an exception)
    @Test
    public void testDivideByZero() {
        Calculater divideOperation = new Divide();
        assertThrows(ArithmeticException.class, () -> divideOperation.calculate(5, 0), "Division by zero should throw an ArithmeticException");
    }

    // Test for invalid inputs (Edge Case for Division)
    @Test
    public void testInvalidDivide() {
        Calculater divideOperation = new Divide();
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> divideOperation.calculate(1, 0));
        assertEquals("Cannot divide by zero", thrown.getMessage(), "Error message should match the expected message");
    }
}