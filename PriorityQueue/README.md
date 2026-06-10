# Priority Queue

## Overview
A Priority Queue is a data structure where each element has an associated priority. Elements with higher priority are served before those with lower priority.

## Algorithm Explanation
- **Insert**: Add element with priority (O(log n))
- **Extract Max/Min**: Remove highest/lowest priority element (O(log n))
- **Peek**: View highest priority element (O(1))
- Usually implemented using a heap (binary heap)
- Can be max-heap or min-heap

## Visualization
```
Priority Queue (Max-Heap):
         [10]
        /    \
      [8]    [5]
     /  \    /
   [3] [2] [1]

Enqueue(12, 3):
         [12]
        /    \
      [10]   [5]
     /   \   /
   [3]  [2][1]

Dequeue:
         [10]
        /    \
      [8]    [5]
     /  \    /
   [3] [2] [1]
```

## Core Logic
```java
public void insert(int value, int priority) {
    // Add element maintaining priority order
}

public int extractMax() {
    // Remove and return highest priority element
}

public int peek() {
    // View highest priority element
}

public void display() {
    // Print all elements with priorities
}
```

## Expected Output
```
Inserted elements with priorities
Extracted max: element_name
Current queue state displayed
```

## Key Methods
- `insert(int value, int priority)` - Add element with priority
- `extractMax()` - Remove highest priority
- `peek()` - View highest priority
- `isEmpty()` - Check if empty
- `display()` - Show queue contents

## Use Cases
- Job scheduling
- Dijkstra's shortest path
- Huffman coding
- Load balancing
- Event simulation
- Medical emergency room (triage)
