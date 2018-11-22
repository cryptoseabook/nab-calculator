package au.com.nab.codetest.operators;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusTest {
    private Plus plus;

    @Before
    public void setUp() throws Exception {
        this.plus = new Plus();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void exec() {
        double num1 = 3.0;
        double num2 = 2;
        double result = plus.exec(num1, num2);
        assertEquals(5.0, result, 6);
    }
}