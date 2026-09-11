/**
 * Provides basic timing functionality for measuring
 * the execution time of sorting algorithms.
 */
public class Stopwatch {

    private long startTime;
    private long stopTime;

    /**
     * Creates a new Stopwatch.
     */
    public Stopwatch() {
    }

    /**
     * Records the starting time of an operation.
     */
    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    /**
     * Records the ending time of an operation.
     */
    public void stopTimer() {
        stopTime = System.currentTimeMillis();
    }

    /**
     * Calculates the elapsed time between the start and stop times.
     *
     * @return elapsed time in milliseconds
     */
    public long elapsedTime() {
        return stopTime - startTime;
    }
}