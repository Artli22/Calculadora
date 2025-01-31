import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class TestCalculadoraPostfix {

    // Prueba de validacion de logica aritmetica 
    /**
     * 
     */
    @Test
    public void testEvaluate_ValidExpression(){
        Interfaz calc = new CalculadoraPostfix();
        String expression = "4 5 * ";
        int result = calc.evaluar(expression);
        assertEquals(20, result);
    }
    
    //Prueba de validacion de la relacion digitos y signos
    /**
     * 
     */
    @Test
    public void testEvaluate_MoreDigitsThanTokens(){
        Interfaz calc = new CalculadoraPostfix();
        String expression = "1 2 4 + ";
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            calc.evaluar(expression);
        });
        assertEquals("Expresión no válida", exception.getMessage());
    }

    // Prueba para dectectar signos no validos 
    /**
     * 
     */
    @Test 
    public void testEvaluate_InvalidCharacter() {
        Interfaz calc = new CalculadoraPostfix();
        String expression = "3 4 u 2 *"; 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.evaluar(expression);
        });
        assertEquals("Entrada inválida: u", exception.getMessage());
    }
    
}
