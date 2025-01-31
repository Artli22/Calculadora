import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class TestStackVector1 {

    // Prueba comprobar vacio de stack
    /**
     * 
     */
    @Test 
    public void testEvaluate_PeakEmpty(){
        Stack<Integer> stack = new StackVector1<>();
        Exception exception = assertThrows(IllegalStateException.class, () -> stack.pop());
        assertEquals("Stack is empty", exception.getMessage());
    }  
    
    //Prueba comprobar metodo peek/revisar 
    /**
     * 
     */
    @Test
    public void testEvaluate_peek() {
    Stack<Integer> stack = new StackVector1<>();
    stack.push(30);
    stack.push(40);
    Integer peekedValue = stack.peek();
    assertNotNull(peekedValue); 
    assertEquals(40, peekedValue.intValue());
    System.out.println("Prueba Peek exitosa");
}
   
}
