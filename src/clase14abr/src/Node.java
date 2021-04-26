public class Node<T > {
    private T valor;
    private Node next;

    public Node(T valor) {
        this.valor = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return this.valor;
    }
}
