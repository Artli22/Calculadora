import java.util.Vector;

public class StackVector1<E> implements Stack<E> {
    // Atributos
    private Vector<E> stack;

    // Métodos
    public StackVector1() {
        this.stack = new Vector<E>();
    }

    @Override
    public void push(E item) {
        this.stack.add(item);
    }

    public E pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.stack.remove(this.stack.size() - 1);
    }

    public E peek() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.stack.get(this.stack.size() - 1);
    }

    public boolean empty() {
        return this.stack.isEmpty();
    }

    public int size() {
        return this.stack.size();
    }
}