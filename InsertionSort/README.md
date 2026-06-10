# Insertion Sort

## Overview
Insertion Sort builds the sorted array one item at a time by inserting each element into its proper position within the already-sorted portion.

## Algorithm Explanation
- Start from the second element
- Compare with elements before it in the sorted portion
- Insert the element in the correct position
- Shift other elements right if needed
- Time Complexity: O(n²) in worst/average case, O(n) in best case
- Space Complexity: O(1)

## Visualization
```
Initial: [unsorted array]

Pass 1: [elem1, elem2]           (first 2 elements sorted)
Pass 2: [elem1, elem2, elem3]    (first 3 elements sorted)
...continues until array sorted
```

## Core Logic
- For each element starting at index 1:
  - Compare with elements to the left
  - Shift larger elements right
  - Insert element at correct position

## Expected Output
```
Sorted array in ascending order
```

## Key Methods
- `insertionSort()` - Main sorting function

## Use Cases
- Online sorting (data arrives one at a time)
- Small datasets
- Nearly sorted data
- Stable sort required
