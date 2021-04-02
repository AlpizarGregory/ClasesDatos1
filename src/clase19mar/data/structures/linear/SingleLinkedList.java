package clase19mar.data.structures.linear;

public class SingleLinkedList {
    private Node first = null;

    public void addFirst(int e) {
                     //Condición     Verdadero      Falso
        // this.first = this.isEmpty() ? new Node(e) : new Node(e, this.first);
        if (this.isEmpty()) {
            this.first = new Node(e);
        } else {
            Node temp = new Node(e);
            temp.next = this.first;
            this.first = temp;
        }
    }

    public void addLast(int e) {

    }

    public boolean isEmpty() {
        return first == null;
    }

    private static class Node {
        int data;
        Node next = null;

        public Node (int e) {
            this.data = e;
        }
    }
}
