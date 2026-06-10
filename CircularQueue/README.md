# Circular Queue

## Overview
A Circular Queue is a queue where the last position connects back to the first position, making it circular. This efficiently reuses space after dequeue operations.

## Algorithm Explanation
- **Enqueue**: Add element at rear (O(1))
- **Dequeue**: Remove element from front (O(1))
- **Display**: Show all elements (O(n))
- Maintains front and rear pointers
- Solves wasted space problem of linear queues
- Time Complexity: O(1) for all operations
- Space Complexity: O(n)

## Visualization
```
Initial Queue (capacity 5):
[_] [_] [_] [_] [_]

After Enqueue(1,2,3,4,5):
[1] [2] [3] [4] [5]
 ^                   (front=0, rear=4)

After Dequeue, Dequeue:
[_] [_] [3] [4] [5]
         ^        (front=2, rear=4)

After Enqueue(6):
[6] [_] [3] [4] [5]
      ^          (front=2, rear=0) - wraps around
```

## Core Logic
```java
public void enqueue(int value) {
    if ((rear + 1) % capacity == front) {
        System.out.println("Queue is full");
        return;
    }
    rear = (rear + 1) % capacity;
    queue[rear] = value;
}

public void dequeue() {
    if (front == rear) {
        System.out.println("Queue is empty");
        return;
    }
    front = (front + 1) % capacity;
    return queue[front - 1];
}
```

## Expected Output
```
Enqueue: 1, 2, 3, 4, 5
Queue: [1] [2] [3] [4] [5]
Dequeue: 1
Dequeue: 2
Enqueue: 6
Queue: [3] [4] [5] [6] [_]
```

## Key Methods
- `enqueue(int value)` - Add to rear
- `dequeue()` - Remove from front
- `display()` - Show queue contents
- `isEmpty()` - Check if empty
- `isFull()` - Check if full

## Use Cases
- Printer job scheduling
- Disk scheduling
- Memory management
- Traffic light systems
- CPU scheduling
