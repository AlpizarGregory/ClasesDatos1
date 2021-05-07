package cr.estudiantec.sorts.bubble;

public class BubbleSort {
    public static void main(String[] args) {
        int[] values = {23, 25, 86, 1, 12};

        System.out.println("Bubble sort");
        printValues(values);

        bubbleSort(values);
        printValues(values);
    }

    private static void printValues(int[] values) {
        int lastElement = values.length - 1;
        System.out.print("[");
        for (int i=0; i < lastElement; i++) {
            System.out.print(values[i] + ", ");
        }
        System.out.print(values[lastElement] + "]\n");
    }

    static void bubbleSort(int[] values) {
        int nElements = values.length;
        int in;
        int out;

        for (out = nElements - 1; out > 1; out --) {
            for (in = 0; in < out; in++) {
                if (values[in] > values[in + 1]) {
                    swap(in, in + 1, values);
                }
//                System.out.println(in);
//                printValues(values);
            }
        }
    }

    static void swap(int current, int next, int[] values) {
        int temp = values[next];
        values[next] = values[current];
        values[current] = temp;
    }
}
