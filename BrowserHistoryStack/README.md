# Browser History Stack

## Overview
A Browser History Stack implements browser back/forward functionality using a stack data structure.

## Algorithm Explanation
- **Push URL**: Add new URL to history when user visits a page
- **Back**: Move to previous URL in history
- **Forward**: Move to next URL if available
- Typically uses two stacks: back history and forward history
- Time Complexity: O(1) for all operations
- Space Complexity: O(n)

## Visualization
```
Initial (no history):
Back Stack: []
Forward Stack: []
Current: ""

After visiting [google.com, github.com, stackoverflow.com]:
Back Stack: [google.com, github.com]
Forward Stack: []
Current: stackoverflow.com

After Back:
Back Stack: [google.com]
Forward Stack: [stackoverflow.com]
Current: github.com

After Back:
Back Stack: []
Forward Stack: [github.com, stackoverflow.com]
Current: google.com

After Forward:
Back Stack: [google.com]
Forward Stack: [stackoverflow.com]
Current: github.com
```

## Core Logic
```java
public void visit(String url) {
    if (!current.isEmpty()) {
        backStack.push(current);
    }
    current = url;
    forwardStack.clear();   // Clear forward history on new visit
}

public void back() {
    if (!backStack.isEmpty()) {
        forwardStack.push(current);
        current = backStack.pop();
    }
}

public void forward() {
    if (!forwardStack.isEmpty()) {
        backStack.push(current);
        current = forwardStack.pop();
    }
}
```

## Expected Output
```
Visited: google.com
Visited: github.com
Visited: stackoverflow.com
Back: Currently at github.com
Back: Currently at google.com
Forward: Currently at github.com
```

## Key Methods
- `visit(String url)` - Visit new URL
- `back()` - Go to previous URL
- `forward()` - Go to next URL

## Use Cases
- Web browser navigation
- File system navigation
- Application state history
- Document editing history
