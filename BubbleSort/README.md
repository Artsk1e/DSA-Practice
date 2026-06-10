# Bubble Sort

## Overview
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they're in the wrong order.

## Algorithm Explanation
- Compare adjacent pairs of elements
- Swap if the left element is greater than the right element
- Repeat until no swaps are needed (array is sorted)
- Time Complexity: O(n²) in worst/average case, O(n) in best case
- Space Complexity: O(1)

## Visualization
```
Initial: [6, 5, 4, 2, 3, 7, 8, 0, 10, 11, 1]

Pass 1: [5, 4, 2, 3, 6, 7, 8, 0, 10, 1, 11]  (largest element bubbles to end)
Pass 2: [4, 2, 3, 5, 6, 7, 0, 8, 1, 10, 11]  (second largest in place)
...continues until sorted
```

## Core Logic
```java
for(int i = 0; i < array.length-1; i++) {
    for(int j = 0; j < array.length - i -1; j++){
        if(array[j] > array[j+1]) {
            // swap
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}
```

## Expected Output
```
0 1 2 3 4 5 6 7 8 10 11
```

## Key Methods
- `bubbleSort(int[] array)` - Main sorting function

## Use Cases
- Educational purposes (easy to understand)
- Small datasets
- Nearly sorted data
