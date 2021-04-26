package trees;
// Practice

// Implementation
public class Node<T extends Comparable<T>> {
    //    private static Object Node;
    T element;
    Node<T> left;
    Node<T> right;

    public Node(T element) {
        this(element, null, null);
    }

    public Node(T element, Node<T> left, Node<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        BinaryTree arbol = new BinaryTree();
        arbol.insert(50);
        arbol.insert(95);
        arbol.insert(33);
        arbol.insert(48);
        arbol.insert(100);
        arbol.insert(64);
        arbol.insert(52);
        arbol.insert(30);
        System.out.println(arbol.contains(30));
        System.out.println(arbol.contains(50));
        System.out.println(arbol.findMax());
        System.out.println(arbol.findMin());
        arbol.remove(30);
        System.out.println(arbol.contains(30));
        System.out.println(arbol.findMin());
    }
}
