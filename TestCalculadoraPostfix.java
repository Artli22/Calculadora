import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class TestCalculadoraPostfix {

    // Prueba de validacion de logica aritmetica 
    @Test
    public void testEvaluate_ValidExpression(){
        CalculadoraPostfix calc = new CalculadoraPostfix();
        String expression = "4 5 * ";
        int result = calc.evaluate(expression);
        assertEquals(20, result);
    }
    
    //Prueba de validacion de la relacion digitos y signos
    @Test
    public void testEvaluate_MoreDigitsThanTokens(){
        CalculadoraPostfix calc = new CalculadoraPostfix();
        String expression = "1 2 4 + ";
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            calc.evaluate(expression);
        });
        assertEquals("Expresión no válida", exception.getMessage());
    }

    // Prueba para dectectar signos no validos 
    @Test 
    public void testEvaluate_InvalidCharacter() {
        CalculadoraPostfix calc = new CalculadoraPostfix();
        String expression = "3 4 u 2 *"; 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.evaluate(expression);
        });
        assertEquals("Entrada inválida: u", exception.getMessage());
    }
    
}
