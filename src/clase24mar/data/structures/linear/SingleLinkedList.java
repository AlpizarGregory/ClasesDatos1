package clase24mar.data.structures.linear;
// La carpeta test es parte de este ejemplo

public class SingleLinkedList {
    private Node first = null;

    public void addFirst(int e) {
        if (this.isEmpty()) {
            this.first = new Node(e);
        } else {
            Node temp = new Node(e);
            temp.next = this.first;
            this.first = temp;
        }
    }

    public void addLast(int e) {
        if (this.first == null) {
            this.first = new Node(e);
            return;
        }
        Node temp = this.first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
    }

    public void addAt(int e, int pos) {
        if (pos < 0) {
            throw new IllegalArgumentException("Pos cannot be negative");
        }
        if (pos == 0) {
            this.addFirst(e);
            return;
        }
        pos --;
        var prev = this.first;
        while (prev.next != null && pos > 0) {
            prev = prev.next;
        }
        prev.next = new Node(e);
//        var prev = this.first;
//        var temp = this.first.next;
//        pos--;
//        while (temp.next != null && pos > 0) {
//            prev = temp;
//            temp = temp.next;
//            pos--;
//        }
//        if (pos > 0 ) {
//            throw new IllegalArgumentException("pos is out of bounds");
//        }
//
//        var newNode = new Node(e);
//        newNode.next = prev.next;
//        prev.next = newNode;
//        newNode.next = temp.next;
//        temp.next = newNode;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node temp = this.first;
        while (temp != null) {
            if (!builder.isEmpty()) {
                 builder.append(", ");
            }
            builder.append(temp.data);
            temp = temp.next;
        }
        return builder.toString();
    }

    private static class Node {
        int data;
        Node next = null;

        public Node (int e) {
            this.data = e;
        }
    }
}
