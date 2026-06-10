# Simple Browse Linked List

## Overview
A Simple Browse Linked List implements browser history functionality using a linked list data structure to track visited pages.

## Algorithm Explanation
- Each node stores: URL and link to next URL
- **Visit URL**: Add new URL to list
- **Browse Forward**: Move to next URL
- **Browse Backward**: Move to previous URL
- Supports traversal in both directions
- Time Complexity: O(n) for finding URLs
- Space Complexity: O(n)

## Visualization
```
Browser History Linked List:
[google.com] -> [github.com] -> [stackoverflow.com] -> [wikipedia.org]

Current Position:
[google.com] -> [github.com]* -> [stackoverflow.com] -> [wikipedia.org]

After visiting new page:
[google.com] -> [github.com] -> [stackoverflow.com] -> [wikipedia.org] -> [leetcode.com]
```

## Core Logic
```java
public void visitURL(String url) {
    Node newNode = new Node(url);
    if (head == null) {
        head = newNode;
    } else {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}

public void displayHistory() {
    Node current = head;
    while (current != null) {
        System.out.print(current.url + " -> ");
        current = current.next;
    }
    System.out.println("null");
}
```

## Expected Output
```
Browser History:
[google.com] -> [github.com] -> [stackoverflow.com] -> null
```

## Key Methods
- `visitURL(String url)` - Add URL to history
- `displayHistory()` - Show all visited URLs
- `browse()` - Navigate through history

## Use Cases
- Browser history tracking
- Web crawling
- Website navigation logs
- User activity tracking
