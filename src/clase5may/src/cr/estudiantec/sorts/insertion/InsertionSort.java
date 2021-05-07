package cr.estudiantec.sorts.insertion;

public class InsertionSort {
    public static void main(String[] args) {
        int[] values = {23, 25, 86, 1, 12};

        System.out.println("Insertion sort");
        printValues(values);

        insertionSort(values);
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

    static void insertionSort(int[] values) {
        int nElems = values.length;
        int in;
        int out;

        for (out = 1; out < nElems; out++) {
            long temp = values[out];
            in = out;
            while (in > 0 && values[in - 1] >= temp) {
                values[in] = values[in-1];
                --in;
            }
            values[in] = (int) temp;
//            System.out.println(out);
//            printValues(values);
        }
    }
}
