# Doubly Linked List

## Overview
A Doubly Linked List is a linear data structure where each node contains data, a reference to the next node, AND a reference to the previous node. Navigation is bidirectional.

## Algorithm Explanation
- Each node has: data, next pointer, and previous pointer
- **Insert at Front**: Add node at beginning (O(1))
- **Insert at End**: Add node at end (O(n))
- **Forward Display**: Print all elements forward (O(n))
- **Reverse Display**: Print all elements backward (O(n))
- **Search**: Find element (O(n))

## Visualization
```
Empty List:
null

After Insert(10, 20, 30):
null <-> [10] <-> [20] <-> [30] <-> null

Reverse Display:
[30] <-> [20] <-> [10] <-> null
```

## Core Logic
```java
public void insertAtFront(int newData) {
    Node newNode = new Node(newData);
    if (head != null) {
        newNode.next = head;
        head.prev = newNode;
    }
    head = newNode;
}

public void displayInfo() {
    Node current = head;
    while (current != null) {
        System.out.print("[" + current.data + "] <-> ");
        current = current.next;
    }
    System.out.print("null");
}

public void reverseDisplay() {
    Node current = head;
    if (head == null) return;
    
    // Move to end
    while (current.next != null) current = current.next;
    
    // Traverse backward
    while (current != null) {
        System.out.print("[" + current.data + "] <-> ");
        current = current.prev;
    }
    System.out.print("null");
}
```

## Expected Output
```
Added 10 to the list
Added 20 to the front
Added 30 to the front
Current LinkedList: 
[30] <-> [20] <-> [10] <-> null

Reverse LinkedList:
[10] <-> [20] <-> [30] <-> null
```

## Key Methods
- `insertAtFront(int data)` - Add at beginning
- `insertAtEnd(int data)` - Add at end
- `displayInfo()` - Print forward
- `reverseDisplay()` - Print backward
- `search(int target)` - Find element

## Use Cases
- Music player (previous/next song)
- Undo/Redo with both directions
- Browser history (back/forward)
- Text editor with bidirectional navigation
