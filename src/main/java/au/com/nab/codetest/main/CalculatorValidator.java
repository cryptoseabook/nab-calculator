package au.com.nab.codetest.main;

import java.util.Collection;

public class CalculatorValidator {

  public static final boolean isValidOperation(String operator, Collection<String> allowedOperations) {

    if (allowedOperations == null || allowedOperations.isEmpty()) {
      return false;
    }

    if (allowedOperations.contains(operator)) {
      return true;
    }

    return false;
  }

  public static boolean isValidNumber(String number) {
    return number.matches("[0-9]+[.]?[0-9]*");
  }
}
