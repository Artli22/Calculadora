public class CalculadoraPostfix {
    // Atributos
    private Stack<Integer> stack;

    // Métodos
    public CalculadoraPostfix() {
        this.stack = new StackVector1<>();
    }

    public int evaluate(String expression) {
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalStateException("No hay suficientes operandos para realizar la operación");
                }
                else {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(applyOperator(operand1, operand2, token));
                }
            }
            else {
                try {
                    int operand = Integer.parseInt(token);
                    stack.push(operand);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Entrada inválida: " + token);
                }
            }
        }
        if (stack.size()!= 1) {
            throw new IllegalStateException("Expresión no válida");
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%");
    }

    private int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("División entre cero");
                }
                return a / b;
            case "%":
                return a % b;
            default:
                throw new IllegalArgumentException("Operador no soportado: " + operator);
        }
    }
}
