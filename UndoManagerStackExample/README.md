# Undo Manager Stack Example

## Overview
An Undo Manager using Stack demonstrates how to implement undo functionality in applications by maintaining a history of state changes.

## Algorithm Explanation
- Track state changes in a stack
- **Perform Action**: Push new state to stack
- **Undo**: Pop from stack to revert to previous state
- Each action represents a state change
- Time Complexity: O(1) for push/pop operations
- Space Complexity: O(n) for n actions

## Visualization
```
Empty Stack:
[]

After adding actions:
[Action1]
[Action2]
[Action3]

After Undo (pop):
[Action1]
[Action2]
```

## Core Logic
```java
private Stack<Action> undoStack = new Stack<>();

public void performAction(Action action) {
    // Apply action
    undoStack.push(action);
}

public void undo() {
    if (!undoStack.isEmpty()) {
        Action prevAction = undoStack.pop();
        // Revert to previous state
    }
}
```

## Expected Output
```
Action performed
Undo performed
Previous state restored
```

## Key Methods
- `performAction(Action action)` - Add action and apply it
- `undo()` - Revert to previous state

## Use Cases
- Text editor operations
- Drawing applications
- Database transactions
- Form editing
- Game state management
