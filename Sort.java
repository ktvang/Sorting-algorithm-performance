import java.util.Random;

/**
 * Abstract base class for sorting algorithms.
 *
 * <p>Creates a shared set of randomly generated integer arrays
 * that concrete sorting classes can copy and sort using their
 * respective algorithms.</p>
 */
public abstract class Sort {

    protected int[][] initial;

    /** Size of the test array used to verify sorting. */
    public static final int TEST = 20;

    /** Stopwatch used to measure sorting performance. */
    public Stopwatch sw;

    /**
     * Creates the initial test data.
     *
     * <p>The first array contains 20 elements. Each subsequent
     * array doubles in size to provide increasingly larger datasets
     * for performance analysis.</p>
     */
    public Sort() {
        sw = new Stopwatch();

        int rows = 8;
        initial = new int[rows][];

        int size = TEST;
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            initial[i] = new int[size];

            for (int j = 0; j < size; j++) {
                initial[i][j] = random.nextInt();
            }

            size *= 2;
        }
    }

    /**
     * Displays the contents of an integer array.
     *
     * @param a array to display
     */
    public static void show(int[] a) {
        for (int num : a) {
            System.out.printf("%20d%n", num);
        }
    }

    /**
     * Determines whether an array is sorted in ascending order.
     *
     * @param a array to check
     * @return true if the array is sorted; false otherwise
     */
    public boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }

        return true;
    }
}