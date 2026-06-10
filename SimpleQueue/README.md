# Simple Queue

## Overview
A Queue is a First-In-First-Out (FIFO) data structure where elements are added at the rear and removed from the front.

## Algorithm Explanation
- **Enqueue**: Add element to rear (O(1))
- **Dequeue**: Remove element from front (O(1))
- **Peek**: View front element without removing (O(1))
- **isEmpty**: Check if queue is empty (O(1))
- **showQueue**: Display all elements

## Visualization
```
Empty Queue:
FRONT -> REAR

After Enqueue(10, 20, 30):
FRONT -> [10] [20] [30] -> REAR

After Dequeue():
FRONT -> [20] [30] -> REAR

After Peek():
Front element is: 20
```

## Core Logic
```java
public void enqueue(int value) {
    // Add to rear
}

public void dequeue() {
    // Remove from front
}

public void peek() {
    // View front element
}
```

## Expected Output
```
Queue is empty
Queue: [empty]
Queue: [10, 20, 30]
Dequeue: 10
Front element: 20
Queue: [20, 30]
```

## Key Methods
- `enqueue(int value)` - Add to rear
- `dequeue()` - Remove from front
- `peek()` - View front element
- `isEmpty()` - Check if empty
- `showQueue()` - Display queue contents

## Use Cases
- Printer job scheduling
- Customer service queues
- Breadth-First Search (BFS)
- Level-order tree traversal
- Message queues
- Round-robin scheduling
