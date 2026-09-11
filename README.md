# Sorting Algorithm Performance

## Overview

This project implements and compares multiple sorting algorithms in Java to examine how their practical performance relates to theoretical Big-O complexity.

The project uses an abstract `Sort` class with concrete implementations for Bubble Sort, Merge Sort, and Java's built-in `Arrays.sort()` method. Random integer datasets of increasing sizes are sorted and their execution times are measured for comparison.

## Features

- Abstract `Sort` base class
- Random integer dataset generation
- Bubble Sort implementation
- Merge Sort implementation
- Java `Arrays.sort()` implementation
- Sorting validation with `isSorted()`
- Runtime measurement using a custom `Stopwatch`
- Performance comparison across increasing input sizes
- Big-O complexity analysis

## Algorithms

### Bubble Sort
- Time Complexity: O(n²)
- Compares adjacent elements and swaps them when they are out of order
- Used as the quadratic-time comparison algorithm

### Merge Sort
- Time Complexity: O(n log n)
- Uses a recursive divide-and-conquer approach
- Splits arrays into smaller sections and merges them back in sorted order

### Java Arrays.sort()
- Java's built-in sorting implementation
- Used as a practical comparison against the custom sorting algorithms

## Technologies

- Java
- Object-Oriented Programming
- Recursion
- Sorting Algorithms
- Big-O Analysis
- Algorithm Performance Measurement

## Results

The sorting algorithms were tested using randomly generated integer arrays of increasing sizes. Each algorithm successfully sorted the data, and the results were verified using the `isSorted()` method.

### Runtime Results

| Input Size | Bubble Sort | Merge Sort | Java Arrays.sort() |
|------------|-------------|------------|--------------------|
| 40         | 0 ms        | 0 ms       | 0 ms               |
| 80         | 1 ms        | 0 ms       | 0 ms               |
| 160        | 0 ms        | 0 ms       | 0 ms               |
| 320        | 1 ms        | 0 ms       | 0 ms               |
| 640        | 1 ms        | 1 ms       | 0 ms               |
| 1,280      | 1 ms        | 3 ms       | 1 ms               |
| 2,560      | 3 ms        | 11 ms      | 1 ms               |

The largest test used 2,560 integers. At this input size, Java's `Arrays.sort()` had the fastest measured runtime at 1 ms, followed by Bubble Sort at 3 ms and Merge Sort at 11 ms.

The results also show that the smaller datasets produced several 0 ms measurements, making it difficult to observe the theoretical Big-O differences at these input sizes. The experiment demonstrates how actual runtime measurements can vary based on dataset size and the precision of the timing method.

### Complexity Comparison

| Algorithm | Theoretical Time Complexity |
|-----------|-----------------------------|
| Bubble Sort | O(n²) |
| Merge Sort | O(n log n) |
| Java Arrays.sort() | O(n log n) |

The experiment provided practical runtime data for comparing these algorithms with their theoretical complexity. The relatively small dataset sizes and millisecond timing resolution limited the ability to clearly observe the expected scaling differences between O(n²) and O(n log n) algorithms.

## What I Demonstrated

- Implementing and comparing different sorting algorithms
- Applying recursion through Merge Sort
- Working with abstract classes and inheritance
- Measuring algorithm execution time
- Verifying sorting correctness
- Comparing practical performance with theoretical Big-O complexity
- Analyzing how algorithm performance changes as input size increases

## Project Structure

```text
sorting-algorithm-performance/
│
├── Sort.java
├── BubbleSort.java
├── MergeSort.java
├── JavaSort.java
├── SortDriver.java
├── Stopwatch.java
└── README.md
