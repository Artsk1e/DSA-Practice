# Text Editor

## Overview
A Text Editor demonstrates basic text manipulation operations like insertion, deletion, and display. Often implements undo/redo using stacks.

## Algorithm Explanation
- Maintain text content as string or character array
- **Insert**: Add text at cursor position
- **Delete**: Remove text at cursor position
- **Display**: Show current text content
- **Undo/Redo**: Track text state changes
- Can use a linked list or array for character storage

## Visualization
```
Initial state:
""

After typing "Hello":
"Hello"
Cursor position: end

After inserting " World" at end:
"Hello World"

After deleting "World":
"Hello "

Undo delete:
"Hello World"
```

## Core Logic
```java
private String content = "";

public void insertText(String text) {
    content += text;
}

public void deleteText(int count) {
    if (count > 0 && count <= content.length()) {
        content = content.substring(0, content.length() - count);
    }
}

public void displayText() {
    System.out.println(content);
}
```

## Expected Output
```
Text inserted: "Hello"
Text inserted: " World"
Current content: "Hello World"
Text deleted
Current content: "Hello "
```

## Key Methods
- `insertText(String text)` - Add text
- `deleteText(int count)` - Remove text
- `displayText()` - Show content
- `undo()` - Undo last action (optional)
- `redo()` - Redo undone action (optional)

## Use Cases
- Simple text editor applications
- Note-taking apps
- Code editor implementation
- Document editors
- Rich text editors
