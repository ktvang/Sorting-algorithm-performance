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

The original experiment tested input sizes from 40 to 2,560 integers. At the largest tested size of 2,560 integers, Bubble Sort took 3 ms, Merge Sort took 11 ms, and Java's `Arrays.sort()` took 1 ms.

The timing results show that Java's built-in `Arrays.sort()` performed fastest in this test. The difference between Bubble Sort and Merge Sort was not large enough to clearly demonstrate their theoretical Big-O differences at these dataset sizes. A larger and more controlled benchmark would provide a better comparison of how each algorithm scales as input size increases.

The results demonstrate how practical runtime can be affected by dataset size, algorithm implementation, and measurement precision when comparing theoretical complexity with actual performance.

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
