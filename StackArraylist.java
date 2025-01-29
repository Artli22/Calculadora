import java.util.ArrayList;

public class StackArraylist<E> {
    private ArrayList<E> stack;

    public StackArraylist() {
        stack = new ArrayList<>();
    }

    public void push(E item) {
        stack.add(item);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return stack.remove(stack.size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}