package au.com.nab.codetest;

import au.com.nab.codetest.main.Calculator;
import au.com.nab.codetest.main.CalculatorValidator;
import au.com.nab.codetest.operators.OperatorFactory;

import java.util.Scanner;
import java.util.Set;

public class App {

  public static void main(String[] args) {
    OperatorFactory operatorFactory = new OperatorFactory();
    Calculator calculator = new Calculator(operatorFactory);

    Set<String> availableOperators = operatorFactory.getOperatorsMap().keySet();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Please input your operands num1");
      String num1 = scanner.nextLine();

      if (!CalculatorValidator.isValidNumber(num1)) {
        System.out.println("Error: " + num1 + " is not allowed number!");
        System.out.println("Let us start over! \n");
        continue;
      }

      System.out.println("Please input your Operation (accepttable operation +, -, *, or /)");
      String operator = scanner.nextLine();


      if (!CalculatorValidator.isValidOperation(operator, availableOperators)) {
        System.out.println("Error: " + operator + " is not allowed here, please only use +, -, *, or /");
        System.out.println("Let us start over! \n");
        continue;
      }


      System.out.println("Please input your operands num2");
      String num2 = scanner.nextLine();

      if (!CalculatorValidator.isValidNumber(num2)) {
        System.out.println("Error: " + num1 + " is not allowed number!");
        System.out.println("Let us start over! \n");
        continue;
      }


      double n1 = Double.valueOf(num1);
      double n2 = Double.valueOf(num2);

      double result = calculator.calc(operator, n1, n2);
      System.out.println("The result is " + result);
      System.out.println("===================================================\n");
    }

  }
}
