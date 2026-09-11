/**
 * Driver class for testing and comparing the sorting algorithms.
 *
 * <p>Creates instances of BubbleSort, MergeSort, and JavaSort
 * to run their sorting tests and display performance results.</p>
 */
public class SortDriver {

    /**
     * Runs the sorting algorithm tests.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        new BubbleSort();
        new MergeSort();
        new JavaSort();
    }
}