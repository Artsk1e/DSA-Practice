# Deque (Double Ended Queue)

## Overview
A Deque (Double Ended Queue) is a data structure that allows insertion and deletion at both ends (front and rear). It combines properties of both Stack and Queue.

## Algorithm Explanation
- **Insert Front**: Add element at front (O(1))
- **Insert Rear**: Add element at rear (O(1))
- **Delete Front**: Remove from front (O(1))
- **Delete Rear**: Remove from rear (O(1))
- **Peek Front**: View front element (O(1))
- **Peek Rear**: View rear element (O(1))

## Visualization
```
Empty Deque:
FRONT -> REAR

After operations:
FRONT -> [4] [3] [2] [1] <- REAR
(can add/remove from both ends)

After Insert Front(5):
FRONT -> [5] [4] [3] [2] [1] <- REAR

After Delete Rear():
FRONT -> [5] [4] [3] [2] <- REAR
```

## Core Logic
```java
public void insertFront(int value) {
    // Add at front
}

public void insertRear(int value) {
    // Add at rear
}

public void deleteFront() {
    // Remove from front
}

public void deleteRear() {
    // Remove from rear
}

public void displayDeque() {
    // Print all elements
}
```

## Expected Output
```
Deque after operations:
Front elements and Rear elements displayed
```

## Key Methods
- `insertFront(int value)` - Add at front
- `insertRear(int value)` - Add at rear
- `deleteFront()` - Remove from front
- `deleteRear()` - Remove from rear
- `displayDeque()` - Show deque contents

## Use Cases
- Sliding window problems
- Undo/Redo functionality (bidirectional)
- Palindrome checking
- Scheduler with priority from both ends
- Web browser history (forward/backward)
