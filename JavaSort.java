import java.util.Arrays;

/**
 * Implements sorting using Java's built-in Arrays.sort() method.
 *
 * <p>This implementation provides a comparison point for the
 * custom sorting algorithms by using Java's optimized sorting
 * implementation.</p>
 */
public class JavaSort extends Sort {

    private int[][] sorted;

    /**
     * Creates a JavaSort object, copies the test data, and sorts
     * each dataset using Arrays.sort() while measuring execution time.
     */
    public JavaSort() {
        super();

        sorted = copyArray();

        System.out.println("\nJava Arrays.sort Test:");
        System.out.println("\nInitial Test Array");

        show(sorted[0]);

        Arrays.sort(sorted[0]);

        System.out.println("\nSorted Test Array");

        show(sorted[0]);

        for (int i = 1; i < sorted.length; i++) {
            sw.startTimer();

            Arrays.sort(sorted[i]);

            sw.stopTimer();

            System.out.println(
                "Elapsed time to Arrays.sort "
                + sorted[i].length
                + " ints = "
                + sw.elapsedTime()
                + " ms."
            );
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