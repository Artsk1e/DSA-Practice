# Action Redo Manager

## Overview
An Action Redo Manager implements Undo/Redo functionality using stacks. It tracks user actions and allows reverting or reapplying them.

## Algorithm Explanation
- **Perform Action**: Add action to undo stack, clear redo stack
- **Undo**: Pop from undo stack, push to redo stack
- **Redo**: Pop from redo stack, push to undo stack
- **Show State**: Display current state
- Uses two stacks: one for undo history, one for redo history

## Visualization
```
Initial state (no actions):
Undo Stack: []
Redo Stack: []
Current: ""

After performAction("Typed 'Hello'"):
Undo Stack: ["Typed 'Hello'"]
Redo Stack: []
Current: "Hello"

After performAction("Changed color to Red"):
Undo Stack: ["Typed 'Hello'", "Changed color to Red"]
Redo Stack: []
Current: "Hello (Red)"

After Undo():
Undo Stack: ["Typed 'Hello'"]
Redo Stack: ["Changed color to Red"]
Current: "Hello"

After Redo():
Undo Stack: ["Typed 'Hello'", "Changed color to Red"]
Redo Stack: []
Current: "Hello (Red)"
```

## Core Logic
```java
public void performAction(String action) {
    undoStack.push(action);
    redoStack.clear();          // Clear redo history on new action
}

public void undo() {
    if (!undoStack.isEmpty()) {
        redoStack.push(undoStack.pop());
    }
}

public void redo() {
    if (!redoStack.isEmpty()) {
        undoStack.push(redoStack.pop());
    }
}

public void showCurrentState() {
    // Display current state
}
```

## Expected Output
```
Undo called (no action to undo)
Redo called (no action to redo)
Action: Typed 'Hello'
Action: Changed color to Red
Action: Deleted Paragraph 2
Current State: Deleted Paragraph 2

Undo performed
Undo performed
Current State: Changed color to Red

Redo performed
Current State: Deleted Paragraph 2
```

## Key Methods
- `performAction(String action)` - Add action
- `undo()` - Undo last action
- `redo()` - Redo undone action
- `showCurrentState()` - Display state

## Use Cases
- Text editor Undo/Redo
- Image editing software
- IDE features
- Browser back/forward
- Application state management
