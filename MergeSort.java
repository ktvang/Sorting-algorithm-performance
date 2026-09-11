/**
 * Implements the Merge Sort algorithm.
 *
 * <p>Merge Sort uses a divide-and-conquer approach to recursively
 * split an array into smaller sections and merge them back together
 * in ascending order. This implementation is used to measure the
 * performance of an O(n log n) sorting algorithm.</p>
 */
public class MergeSort extends Sort {

    private int[][] sorted;

    /**
     * Creates a MergeSort object, copies the test data, and
     * sorts each dataset while measuring its execution time.
     */
    public MergeSort() {
        super();

        sorted = copyArray();

        System.out.println("\nMerge Sort Test:");
        System.out.println("\nInitial Test Array");

        show(sorted[0]);

        mergeSort(sorted[0], 0, sorted[0].length - 1);

        System.out.println("\nSorted Test Array");

        show(sorted[0]);

        for (int i = 1; i < sorted.length; i++) {
            sw.startTimer();

            mergeSort(sorted[i], 0, sorted[i].length - 1);

            sw.stopTimer();

            System.out.println(
                "Elapsed time to Merge sort "
                + sorted[i].length
                + " ints = "
                + sw.elapsedTime()
                + " ms."
            );
        }
    }

    /**
     * Recursively divides the array into smaller sections and
     * merges the sections after they have been sorted.
     *
     * @param a array to sort
     * @param left starting index of the section
     * @param right ending index of the section
     */
    private void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }

    /**
     * Merges two sorted sections of an array into ascending order.
     *
     * @param a array containing the sections to merge
     * @param left starting index of the first section
     * @param mid ending index of the first section
     * @param right ending index of the second section
     */
    private void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[a.length];

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= right) {
            temp[k++] = a[j++];
        }

        for (int x = left; x <= right; x++) {
            a[x] = temp[x];
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