package taskJava.taskJava7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void testSum () {
        assertEquals(4, calculator.sum(2,2));
    }

    @Test
    public void testMul () {
        assertEquals(9.0, calculator.mul(3,3));
    }

}