package au.com.nab.codetest.operators;

import au.com.nab.codetest.operators.Operator;

public class Plus implements Operator {

    public static final String SYMBOL = "+";

    @Override
    public double exec(double num1, double num2) {
        return num1 + num2;
    }
}
