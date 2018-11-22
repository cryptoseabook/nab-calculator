package au.com.nab.codetest.main;

import au.com.nab.codetest.operators.Operator;
import au.com.nab.codetest.operators.OperatorFactory;

public class Calculator {

    private OperatorFactory operatorFactory;

    public Calculator(OperatorFactory operatorFactory) {
        this.operatorFactory = operatorFactory;
    }

    public double calc(String symbol, double num1, double num2) {
        Operator operator = this.operatorFactory.getOperator(symbol);
        return operator.exec(num1, num2);
    }
}
