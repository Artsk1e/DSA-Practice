# Singly Linked List

## Overview
A Singly Linked List is a linear data structure where each node contains data and a reference to the next node. Navigation is only in one direction (forward).

## Algorithm Explanation
- Each node has: data and next pointer
- **Insert at Front**: Add node at beginning (O(1))
- **Insert at End**: Add node at end (O(n))
- **Reverse**: Reverse the entire list (O(n))
- **Search**: Find element (O(n))
- **Display**: Print all elements (O(n))

## Visualization
```
Empty List:
null

After Insert(1,2,3,4,5,6):
[1] -> [2] -> [3] -> [4] -> [5] -> [6] -> null

After Reverse:
[6] -> [5] -> [4] -> [3] -> [2] -> [1] -> null
```

## Core Logic
```java
public void insertAtFront(int newData) {
    Node newNode = new Node(newData);
    newNode.next = head;
    head = newNode;
}

public void insertAtEnd(int newData) {
    Node newNode = new Node(newData);
    if (head == null) {
        head = newNode;
        return;
    }
    Node current = head;
    while (current.next != null) {
        current = current.next;
    }
    current.next = newNode;
}

public void reverse() {
    Node prev = null, current = head, nextNode;
    while (current != null) {
        nextNode = current.next;
        current.next = prev;
        prev = current;
        current = nextNode;
    }
    head = prev;
}
```

## Expected Output
```
[1] ->[2] ->[3] ->[4] ->[5] ->[6] ->null
Reversed the Linked list.
[6] ->[5] ->[4] ->[3] ->[2] ->[1] ->null
```

## Key Methods
- `insertAtFront(int data)` - Add at beginning
- `insertAtEnd(int data)` - Add at end
- `reverse()` - Reverse the list
- `search(int target)` - Find element
- `displayInfo()` - Print list

## Use Cases
- Dynamic memory allocation
- Undo/Redo functionality
- Polynomial representation
- Hash table collision handling
