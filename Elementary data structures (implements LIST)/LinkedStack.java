public class LinkedStack<Type> {
    private LinkedList<Type> stack;

    LinkedStack () {
        stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void push(Type item) {
        stack.append(item);
    }

    public Type pop() {
        return stack.pop();
    }

    public Type peek() {
        return stack.peek();
    }

    public Type[] asArray(Class<Type> type) {
        return stack.asArray(type);
    }
}
