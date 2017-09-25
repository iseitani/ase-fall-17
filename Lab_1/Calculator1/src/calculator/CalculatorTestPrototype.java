package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTestPrototype {

    @Test
    public void testSum() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(3,3);
        assertEquals(6, sum);
    }
    
    @Test
    public void testDivisionEven() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(6,3);
        assertEquals(2, sum);
    }

    @Test
    public void testDivisionOdd() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(7,3);
        assertEquals(2, sum);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(3,1);
    }
    
    @Test
    public void testMultiply() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.multiply(3,3);
        assertEquals(24, sum);
    }
    
    @Test
    public void testSubtract() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.subtract(7,2);
        assertEquals(5, sum);
    }

}