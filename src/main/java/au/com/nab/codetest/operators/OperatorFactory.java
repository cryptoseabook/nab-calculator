package au.com.nab.codetest.operators;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperatorFactory {

    private final Map<String, Class> operatorsMap = new HashMap<>();

    public void init() throws NoSuchFieldException, IllegalAccessException {
        if (operatorsMap.isEmpty()) {
            List<OperatorEnum> operators = Arrays.asList(OperatorEnum.values());
            for (OperatorEnum oe : operators) {
                operatorsMap.put(String.valueOf(oe.getOperator().getField("SYMBOL").get(null)), oe.getOperator());
            }
        }
    }

    public OperatorFactory () {
        try {
            this.init();
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("Operator initialization failed!");
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Operator initialization failed!");
        }
    }

    public Operator getOperator(String symbol) {
        try {
            return (Operator) operatorsMap.get(symbol).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException("Operator " + symbol + " not supported!");
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Operator " + symbol + " not supported!");
        }
    }

    public Map<String, Class> getOperatorsMap() {
        return operatorsMap;
    }
}
