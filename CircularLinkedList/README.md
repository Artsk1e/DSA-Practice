# Circular Linked List

## Overview
A Circular Linked List is a linked list where the last node points back to the first node, forming a circle. There's no explicit null terminator.

## Algorithm Explanation
- Each node has: data and next pointer
- **Add Data**: Add node to the list (O(1))
- **Search**: Find element by value (O(n))
- **Display**: Print all elements (O(n))
- **Reverse Display**: Print elements in reverse order (O(n))
- **Reverse List**: Reverse the entire list structure (O(n))

## Visualization
```
Empty List:
(circular, no head)

After Add(1,2,3,4):
[1] -> [2] -> [3] -> [4] -> [1] (circles back)

Search for 2: Found

Reverse:
[4] -> [3] -> [2] -> [1] -> [4] (circles back)
```

## Core Logic
```java
public void addData(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        newNode.next = head;
    } else {
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
    }
}

public void search(int target) {
    if (head == null) return;
    Node current = head;
    do {
        if (current.data == target) {
            System.out.println("Element " + target + " found!");
            return;
        }
        current = current.next;
    } while (current != head);
}

public void reverseList() {
    // Reverse the circular structure
}
```

## Expected Output
```
Current List: 1 -> 2 -> 3 -> 4 -> (circles back)
Search for 2: Element 2 found!
Search for 5: Element not found
Reverse List...
Reversed List: 4 -> 3 -> 2 -> 1 -> (circles back)
```

## Key Methods
- `addData(int data)` - Add element
- `search(int target)` - Find element
- `displayInfo()` - Print list
- `reverseDisplay()` - Print in reverse
- `reverseList()` - Reverse the structure

## Use Cases
- Round-robin scheduling
- Game sessions (players in circle)
- Clock representation
- Multiplayer game turns
- Operating system process scheduling
