public class SinglyLinkedList <T extends Comparable<T>>{
    private Node<T> first = null;

    public SinglyLinkedList() {

    }

    public void sumarLista() {
        int total = 0;
        var current = this.first;
        while (current != null) {
            total += (int) current.getValue();
            current = current.getNext();
        }

        System.out.println(total);
    }

    public void print() {
        var current = this.first;
        while (current != null) {
            current = current.getNext();

            System.out.println(current.getValue());
        }
    }

    public boolean contains(T toFind) {
        var current = this.first;
        while (current != null) {
            if (toFind.compareTo(current.getValue()) == 0) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void addLast(T valor) {
        if (this.first == null) {
            this.first = new Node<T>(valor);
        } else {
            var current = this.first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node<T>(valor));
        }
    }
}
