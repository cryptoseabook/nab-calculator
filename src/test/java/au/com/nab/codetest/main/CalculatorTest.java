package au.com.nab.codetest.main;

import au.com.nab.codetest.main.Calculator;
import au.com.nab.codetest.operators.OperatorFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        OperatorFactory operatorFactory = new OperatorFactory();
        calculator = new Calculator(operatorFactory);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calc() {
        double result1 = calculator.calc("+", 1.0, 2);
        assertEquals(3, result1, 0);

        double result2 = calculator.calc("-", 1.0, 2);
        assertEquals(-1, result2, 0);

        double result3 = calculator.calc("*", 1.0, 2);
        assertEquals(2, result3, 0);

        double result4 = calculator.calc("/", 1.0, 2);
        assertEquals(0.5, result4, 0);
    }
}