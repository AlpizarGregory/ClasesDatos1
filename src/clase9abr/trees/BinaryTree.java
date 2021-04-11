package clase9abr.trees;

// Implementation
public class BinaryTree<T extends Comparable<? super T>> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    // Contains operation
    public boolean contains(T element) {
        return this.contains(element, this.root);
    }

    private boolean contains(T element, Node<T> node) {
        if (node == null) {
            return false;
        } else {
            int compareResult = element.compareTo(node.element);

            if (compareResult < 0) {
                return contains(element, node.left);
            } else if (compareResult > 0) {
                return contains(element, node.right);
            } else {
                return true;
            }
        }
    }

    // Min && max operation
    public Node<T> findMin() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.findMin(this.root).element;
        }
    }

    public Node<T> findMax() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.findMax(this.root).element;
        }
    }

    // Insert operation
    private Node<T> insert(T element, Node<T> current) {
        if (current == null) {
            return new Node<T>(element, null, null);
        }
        int compareResult = element.compareTo(node.element);

        if (compareResult < 0) {
            current.left = this.insert(element, node.left);
        } else  if (compareResult > 0) {
            current.right = this.insert(element, node.right);
        }

        return current;
    }

    // Remove operation
    public void remove(T element) {
        this.root = this.remove(element, this.root);
    }
}
