package au.com.nab.codetest.operators;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorFactoryTest {
    private OperatorFactory operatorFactory;

    @Before
    public void setUp() throws Exception {
        operatorFactory = new OperatorFactory();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void init() throws NoSuchFieldException, IllegalAccessException {
        operatorFactory.init();
        boolean isEmpty = operatorFactory.getOperatorsMap().isEmpty();
        assertTrue("The operators should initialized and size should not be empty!", !isEmpty);

        int operatorEnumNo = OperatorEnum.values().length;
        int operatorFactoryMapSize =  operatorFactory.getOperatorsMap().size();

        assertEquals(operatorEnumNo, operatorFactoryMapSize, 0);
    }

    @Test
    public void getOperator() {
        Operator plusOperator = operatorFactory.getOperator("+");
        assertTrue(plusOperator instanceof  Plus);

        Operator minusOperator = operatorFactory.getOperator("-");
        assertTrue(minusOperator instanceof  Minus);

        Operator multiplyOperator = operatorFactory.getOperator("*");
        assertTrue(multiplyOperator instanceof  Multiply);

        Operator divideOperator = operatorFactory.getOperator("/");
        assertTrue(divideOperator instanceof  Divide);
    }
}