/**
 * Implements the Bubble Sort algorithm.
 *
 * <p>Bubble Sort repeatedly compares adjacent elements and swaps
 * them when they are out of order. This implementation is used
 * to measure the performance of an O(n^2) sorting algorithm.</p>
 */
public class BubbleSort extends Sort {

    private int[][] sorted;

    /**
     * Creates a BubbleSort object, copies the test data, and
     * sorts each dataset while measuring its execution time.
     */
    public BubbleSort() {
        super();

        sorted = copyArray();

        System.out.println("\nBubble Sort Test:");
        System.out.println("\nInitial Test Array");

        show(sorted[0]);

        bubbleSort(sorted[0]);

        System.out.println("\nSorted Test Array");

        show(sorted[0]);

        for (int i = 1; i < sorted.length; i++) {
            sw.startTimer();

            bubbleSort(sorted[i]);

            sw.stopTimer();

            System.out.println(
                "Elapsed time to Bubble sort "
                + sorted[i].length
                + " ints = "
                + sw.elapsedTime()
                + " ms."
            );
        }
    }

    /**
     * Sorts an integer array in ascending order using Bubble Sort.
     *
     * <p>Adjacent elements are compared and swapped when the
     * preceding element is greater than the following element.</p>
     *
     * @param a array to sort
     */
    private void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Creates independent copies of the original test arrays
     * so the sorting algorithms do not modify the shared data.
     *
     * @return copied test arrays
     */
    private int[][] copyArray() {
        int[][] copy = new int[initial.length][];

        for (int i = 0; i < initial.length; i++) {
            copy[i] = new int[initial[i].length];

            System.arraycopy(
                initial[i],
                0,
                copy[i],
                0,
                initial[i].length
            );
        }

        return copy;
    }
}