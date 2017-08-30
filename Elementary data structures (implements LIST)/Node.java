public class Node<Type> {
    Type item;
    Node<Type> next;
    Node<Type> prev;

    Node(Type item, Node<Type> next, Node<Type> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}