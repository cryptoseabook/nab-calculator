package au.com.nab.codetest.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class CalculatorValidatorTest {
  private CalculatorValidator validator;

  @Before
  public void setUp() throws Exception {
    validator = new CalculatorValidator();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void isValidOperation() {
    boolean isValid1 = validator.isValidNumber("11.0");
    assertTrue(isValid1);


    boolean isValid2 = validator.isValidNumber("11.01");
    assertTrue(isValid2);

    boolean isValid3 = validator.isValidNumber("11a.01");
    assertFalse(isValid3);
  }

  @Test
  public void isValidNumber() {
    Collection operatorsAllowed = Arrays.asList("-", "+", "*", "/");
    boolean isValid1 =  validator.isValidOperation("+", operatorsAllowed);

    assertTrue(isValid1);

    boolean isValid2 =  validator.isValidOperation("*", operatorsAllowed);
    assertTrue(isValid2);

    boolean isValid3 =  validator.isValidOperation("sin", operatorsAllowed);
    assertFalse(isValid3);
  }
}
