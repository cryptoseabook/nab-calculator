package au.com.nab.codetest.operators;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTest {
    private Divide divide;

    @Before
    public void setUp() throws Exception {
        divide = new Divide();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void exec() {
        double num1 = 1.0;
        double num2 = 2.0;
        double result = divide.exec(num1, num2);
        assertEquals(0.5, result, 0);
    }
}