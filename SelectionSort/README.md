# Selection Sort

## Overview
Selection Sort divides the array into sorted and unsorted portions, repeatedly selecting the minimum element from the unsorted portion.

## Algorithm Explanation
- Find the minimum element in the unsorted portion
- Swap it with the first element of the unsorted portion
- Move the boundary between sorted and unsorted portions
- Repeat until entire array is sorted
- Time Complexity: O(n²) in all cases
- Space Complexity: O(1)

## Visualization
```
Initial: [unsorted array]

Pass 1: [min1, ...unsorted...]   (smallest element in place)
Pass 2: [min1, min2, ...unsorted] (second smallest in place)
...continues until array sorted
```

## Core Logic
- For each position i:
  - Find minimum in remaining unsorted portion
  - Swap minimum with element at position i

## Expected Output
```
Sorted array in ascending order
```

## Key Methods
- `selectionSort()` - Main sorting function

## Use Cases
- Minimizes number of writes (important for flash memory)
- When swap operations are expensive
- Small datasets
