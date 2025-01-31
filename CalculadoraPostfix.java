/** Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos
 * Hoja de Trabajo no.2: Programa de Evaluacion Postfix
 * Grupo no: 12
 * Arturo Lima - 24683
 * Ronald Catun - 19789
 * Luis Hernandez - 24337
*/
public class CalculadoraPostfix implements Interfaz {
    // Atributos
    /**
     *
     */
    private Stack<Integer> stack;

    // Métodos
    /**
     * 
     */
    public CalculadoraPostfix() {
        this.stack = new StackVector1<>();
    }

    // Metodo de evaluacion de la expresion ingresada
    @Override
    public int evaluar(String expression) {
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%")) {
                if (stack.size() < 2) {
                    throw new IllegalStateException("No hay suficientes operandos para realizar la operación");
                }
                else {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operar(operand1, operand2, token));
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

    // Metodos para operaciones correspondientes al signo
    @Override
    public int operar(int operandoA, int operandoB, String operador) {
        switch (operador) {
            case "+":
                return operandoA + operandoB;
            case "-":
                return operandoA - operandoB;
            case "*":
                return operandoA * operandoB;
            case "/":
                if (operandoB == 0) {
                    throw new ArithmeticException("División entre cero");
                }
                return operandoA / operandoB;
            case "%":
                return operandoA % operandoB;
            default:
                throw new IllegalArgumentException("Operador no soportado: " + operador);
        }
    }
}
