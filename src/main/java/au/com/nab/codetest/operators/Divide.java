package au.com.nab.codetest.operators;

public class Divide implements Operator {
    public static final String SYMBOL = "/";

    @Override
    public double exec(double num1, double num2) {

        if (num2 == 0) {
            throw new RuntimeException("Divider can't be zero");
        }

        return num1 / num2;
    }
}
