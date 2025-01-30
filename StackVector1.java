/** Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos
 * Hoja de Trabajo no.2: Programa de Evaluacion Postfix
 * Grupo no: 12
 * Arturo Lima - 24683
 * Ronald Catun - 19789
 * Luis Hernandez - 
*/
import java.util.Vector;

public class StackVector1<E> implements Stack<E> {
    // Atributos
    private Vector<E> stack;

    // Métodos
    public StackVector1() {
        this.stack = new Vector<E>();
    }

    // Metodo agregar
    @Override
    public void push(E item) {
        this.stack.add(item);
    }

    // Metodo borrar
    public E pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.stack.remove(this.stack.size() - 1);
    }

    // Metodo revisar
    public E peek() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.stack.get(this.stack.size() - 1);
    }

    //Metodo vacio 
    public boolean empty() {
        return this.stack.isEmpty();
    }
    
    // Metodo tamano
    public int size() {
        return this.stack.size();
    }
}