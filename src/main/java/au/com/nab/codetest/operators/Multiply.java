package au.com.nab.codetest.operators;

public class Multiply implements Operator {

    public static final String SYMBOL = "*";

    @Override
    public double exec(double num1, double num2) {
        return num1 * num2;
    }
}
