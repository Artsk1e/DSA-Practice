# Merge Sort

## Overview
Merge Sort is a divide-and-conquer algorithm that divides the array into halves, recursively sorts them, and merges the sorted halves.

## Algorithm Explanation
- **Divide**: Split array into two halves
- **Conquer**: Recursively sort each half
- **Merge**: Merge the sorted halves back together
- Time Complexity: O(n log n) in all cases
- Space Complexity: O(n)

## Visualization
```
Initial: [2, 4, 6, 7, 3, 1, 8, 5, 9, 10]

Divide:  [2,4,6,7,3]  [1,8,5,9,10]
         [2,4,6] [7,3]  [1,8] [5,9,10]
         [2] [4] [6] [7] [3]  [1] [8] [5] [9] [10]

Merge:   [2,4] [6,7] [3]  [1,8] [5,9] [10]
         [2,4,6,7] [1,3,8,5,9,10]
         
Sorted:  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
```

## Core Logic
```java
private static void mergeSort(int[] array) {
    if (array.length <= 1) return;
    
    int middle = array.length / 2;
    int[] left = new int[middle];
    int[] right = new int[array.length - middle];
    
    // Split
    for (int i = 0; i < middle; i++) left[i] = array[i];
    for (int i = middle; i < array.length; i++) right[i - middle] = array[i];
    
    mergeSort(left);
    mergeSort(right);
    merge(left, right, array);
}
```

## Expected Output
```
Unsorted Array: 2 4 6 7 3 1 8 5 9 10
The array has been sorted.
Sorted Array: 1 2 3 4 5 6 7 8 9 10
```

## Key Methods
- `mergeSort(int[] array)` - Main sorting function
- `merge(int[] left, int[] right, int[] array)` - Merges two sorted arrays

## Use Cases
- Large datasets
- When worst-case O(n log n) is required
- External sorting
- Stable sort needed
