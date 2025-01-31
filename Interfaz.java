public interface Interfaz {
    /**
     * @param operacion
     * @return
     */
    int evaluar(String operacion); // Evaluar la operación y devolver el resultado
    // pre: operacion no esta vacía
    // post: el resultado de evaluar la operación es devuelto o lanza excepción si la expresión es inválida
    /**
     * @param operandoA
     * @param operandoB
     * @param operador
     * @return
     */
    int operar(int operandoA, int operandoB, String operador); // Realizar operación con dos operandos
    // pre: operandoA y operandoB son números enteros y operador está en la lista de operadores
    // post: devuelve el resultado correcto o lanza una excepción si el operador no es válido o si hay división por cero.
}