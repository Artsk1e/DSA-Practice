# Min Stack

## Overview
A Min Stack is a specialized stack that efficiently tracks the minimum element currently in the stack while supporting standard stack operations.

## Algorithm Explanation
- **Push**: Add element and update minimum (O(1))
- **Pop**: Remove element and update minimum (O(1))
- **getMin()**: Return current minimum (O(1))
- **Top()**: View top element (O(1))
- Uses an auxiliary stack to track minimums at each level
- Maintains two stacks: one for values, one for minimums

## Visualization
```
Main Stack          Min Stack
Push(3):            
[3]                 [3]        (min=3)

Push(5):
[3]                 [3]
[5]                 [3]        (min still 3)

Push(2):
[3]                 [2]
[5]                 [3]
[2]                 [3]        (min=2)

getMin() returns 2
```

## Core Logic
```java
private Stack<Integer> mainStack = new Stack<>();
private Stack<Integer> minStack = new Stack<>();

public void push(int x) {
    mainStack.push(x);
    if (minStack.isEmpty() || x < minStack.peek()) {
        minStack.push(x);
    } else {
        minStack.push(minStack.peek());
    }
}

public int pop() {
    minStack.pop();
    return mainStack.pop();
}

public int getMin() {
    return minStack.peek();
}
```

## Expected Output
```
Push elements and track minimum
Min value queries returned instantly
```

## Key Methods
- `push(int x)` - Add element
- `pop()` - Remove element
- `getMin()` - Get minimum value
- `top()` - View top element

## Use Cases
- Stock span problem
- Online minimum queries
- Constraint checking in algorithms
- Performance-critical applications needing O(1) minimum lookup
