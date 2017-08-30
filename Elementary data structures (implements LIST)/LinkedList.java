import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class LinkedList<Type> implements List<Type> {
    private Node<Type> top;
    private Node<Type> end;
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void append(Type item) {
        if (isEmpty()) {
            end = new Node<Type>(item, null, null);
            top = end;
        }
        else {
            Node<Type> old = end;
            old.next = new Node<>(item, null, old);
            end = old.next;
        }
        size++;
    }

    @Override
    public void prepend(Type item) {
        if (isEmpty()) {
            top = new Node<>(item, null, null);
            end = top;
        }
        else {
            Node<Type> old = top;
            top = new Node<>(item, old, null);
            old.prev = top;
        }
        size++;
    }

    @Override
    public void insert(Type item, int pos) {
        // TODO complete the INSERT implementation
    }

    @Override
    public Type pop() {
        if (isEmpty()) throw new NoSuchElementException("EmptyList Exception");
        Type item = end.item;
        end = end.prev;
        size--;
        return item;
    }

    @Override
    public Type pop(int pos) {
        if (isEmpty()) throw new NoSuchElementException("EmptyList Exception");
        size--;

        Node<Type> now = this.top;

        for (int i = 0; i < pos; i++) {
            now = now.next;
        }

        if (pos == 0) {
            Type item = now.item;
            top = now.next;
            return item;
        }
        else if (pos == this.size - 1) {
            Type item = now.item;
            end = now.prev;
            return item;
        }
        else {
            Type item = now.item;
            now.prev.next = now.next;
            now.next.prev = now.prev;
            return item;
        }

    }

    public Type peek() {
        return this.end.item;
    }

    @Override
    public Type[] asArray(Class<Type> type) {
        @SuppressWarnings("unchecked")
        //Type[] array = (Type[]) new Object[this.size];
        Type[] array = (Type[]) Array.newInstance(type, this.size);
        Node<Type> now = top;
        for (int i = 0; i < this.size; i++) {
            array[i] = now.item;
            now = now.next;
        }
        return array;
    }

}
