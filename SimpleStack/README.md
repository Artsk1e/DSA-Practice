# Simple Stack

## Overview
A Stack is a Last-In-First-Out (LIFO) data structure where elements are added and removed from the same end (top). Implemented using linked list.

## Algorithm Explanation
- **Push**: Add element to the top (O(1))
- **Pop**: Remove and return top element (O(1))
- **Peek**: View top element without removing (O(1))
- **isEmpty**: Check if stack is empty (O(1))
- **Display**: Show all elements from top to bottom

## Visualization
```
Empty Stack:
TOP -> BOTTOM

After Push(10, 20, 30, 40):
TOP -> [40] [30] [20] [10] -> BOTTOM

After Pop():
TOP -> [30] [20] [10] -> BOTTOM
```

## Core Logic
```java
public void push(int x) {
    Node newNode = new Node(x);
    newNode.next = top;
    top = newNode;
}

public int pop() {
    if (top == null) return -1;
    int value = top.data;
    top = top.next;
    return value;
}
```

## Expected Output
```
Current Stack
TOP -> [40] [30] [20] [10] -> BOTTOM

Popped value (x): 40

Stack after 1 pop
TOP -> [30] [20] [10] -> BOTTOM

[10] [20] [30] -> BOTTOM
```

## Key Methods
- `push(int x)` - Add element to top
- `pop()` - Remove and return top element
- `peek()` - View top element
- `isEmpty()` - Check if empty
- `display()` - Show stack contents
- `reverseStack()` - Reverse the stack

## Use Cases
- Function call stack (recursion)
- Undo/Redo functionality
- Browser back button
- Expression evaluation
- Parentheses matching
