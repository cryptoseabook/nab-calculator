package au.com.nab.codetest.operators;

public enum OperatorEnum {
    PLUS(Plus.class),  MINUS(Minus.class), MULTIPLE(Multiply.class), DIVIDE(Divide.class);

    private Class operator;

    private OperatorEnum(Class operator) {
        this.operator = operator;
    }

    public Class getOperator() {
        return this.operator;
    }
}
