import cr.estudiantec.sorts.bubble.BubbleSort;
import cr.estudiantec.sorts.insertion.InsertionSort;
import cr.estudiantec.sorts.selection.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {
    @Test
    void successWithNumericArrayForSelection() {
        int[] unSortedList = {32, 108, 54, 4, 89, 45};
        int[] expected = {4, 32, 45, 54, 89, 108};
        SelectionSort newSort = new SelectionSort();
        int[] sortedList = newSort.start(unSortedList);
        Assertions.assertArrayEquals(expected, sortedList);
    }

    @Test
    void failWhenNullArrayForSelection() {
        boolean thrown = false;
        int[] unSortedList = null;
        SelectionSort newSort = new SelectionSort();
        try {
            int[] sortedList = newSort.start(unSortedList);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assertions.assertTrue(thrown);
    }

    @Test
    void successWithNumericArrayForBubble() {
        int[] unSortedList = {73, 89, 291, 0, 65, 33};
        int[] expected = {0, 33, 65, 73, 89, 291};
        BubbleSort newSort = new BubbleSort();
        int[] sortedList = newSort.start(unSortedList);
        Assertions.assertArrayEquals(expected, sortedList);
    }

    @Test
    void failWhenNullArrayForBubble() {
        boolean thrown = false;
        int[] unSortedList = null;
        BubbleSort newSort = new BubbleSort();
        try {
            int[] sortedList = newSort.start(unSortedList);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assertions.assertTrue(thrown);
    }
    @Test
    void successWithNumericArrayForInsertion() {
        int[] unSortedList = {8, 4, 65, 1, 700, -1};
        int[] expected = {-1, 1, 4, 8, 65, 700};
        InsertionSort newSort = new InsertionSort();
        int[] sortedList = newSort.start(unSortedList);
        Assertions.assertArrayEquals(expected, sortedList);
    }

    @Test
    void failWhenNullArrayForInsertion() {
        boolean thrown = false;
        int[] unSortedList = null;
        InsertionSort newSort = new InsertionSort();
        try {
            int[] sortedList = newSort.start(unSortedList);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assertions.assertTrue(thrown);
    }

}
