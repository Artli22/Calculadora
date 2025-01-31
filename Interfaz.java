public interface Interfaz {
    /**
     * @param operacion
     * @return
     */
    int evaluar(String operacion); // Evaluar la operación y devolver el resultado
    /**
     * @param operandoA
     * @param operandoB
     * @param operador
     * @return
     */
    int operar(int operandoA, int operandoB, String operador); // Realizar operación con dos operandos
}
