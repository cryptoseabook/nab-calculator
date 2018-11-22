package au.com.nab.codetest.operators;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinusTest {
    private Minus minus;

    @Before
    public void setUp() throws Exception {
        minus = new Minus();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void exec() {
        double num1 = 1.0;
        double num2 = 2.0;
        double result = minus.exec(num1, num2);
        assertEquals(-1.0, result, 0);
    }
}