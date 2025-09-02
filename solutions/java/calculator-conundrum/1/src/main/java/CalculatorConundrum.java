import java.util.Objects;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        int sum = 0;

        try{
            switch (operation) {
                case "+" -> sum = operand1 + operand2;
                case "*" -> sum = operand1 * operand2;
                case "/" -> sum = operand1 / operand2;
                default -> throw new IllegalOperationException(String.format("Operation '"+operation+"' does not exist", operation));
            }
        }catch (ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
        return operand1+" "+operation+" "+operand2+" = "+sum;
    }
}

