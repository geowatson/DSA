public class LinkedQueue<Type> {
    private LinkedList<Type> queue;

    LinkedQueue() {
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(Type item) {
        queue.prepend(item);
    }

    public Type dequeue() {
        return queue.pop();
    }

    /**
     * Debugging item - converts queue to an array
     * @param type
     * @return
     */
    public Type[] asArray(Class<Type> type) {
        return queue.asArray(type);
    }
}
