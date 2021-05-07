package cr.estudiantec.sorts.selection;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] values = {23, 25, 86, 1, 12};

//        System.out.println("Selection sort");
//        printValues(values);

//        selectSort(values);
//        printValues(values);
    }

    public SelectionSort() {

    }

    public int[] start(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("Insert a non null array");
        }
        System.out.println("Selection sort");
//        printValues(values);

        selectSort(values);
//        printValues(values);
        return values;
    }

    public static void printValues(int[] values) {
        int lastElement = values.length - 1;
        System.out.print("[");
        for (int i=0; i < lastElement; i++) {
            System.out.print(values[i] + ", ");
        }
        System.out.print(values[lastElement] + "]\n");
    }

    public static void selectSort(int[] values) {
        int endIndex = values.length - 1;
        for (int current = 0; current < endIndex + 1; current++) {
            swap(current, minIndex(current, endIndex, values), values);
//            System.out.println(current);
//            printValues(values);
        }
    }


    static int minIndex(int start, int end, int[] values) {
        int indexOfMin = start;
        for (int i = start + 1; i <= end; i++) {
            if (values[i] < values[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    public static void swap(int current, int minIndex, int[] values) {
        if (values[current] > values[minIndex]) {
            int temp = values[current];
            values[current] = values[minIndex];
            values[minIndex] = temp;
        }
    }
}
