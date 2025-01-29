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
        if (empty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return stack.remove(stack.size() - 1);
    }

    public E peek() {
        if (empty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}