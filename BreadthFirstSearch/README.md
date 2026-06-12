# Breadth-First Search (BFS) on Binary Trees

## Overview

**Breadth-First Search (BFS)** is a graph/tree traversal algorithm that explores nodes level by level, starting from the root node. It visits all nodes at the current depth before moving to nodes at the next depth level. BFS is particularly useful for finding the shortest path in unweighted graphs and for level-order traversal in trees.

In this implementation, BFS is applied to a **Binary Search Tree** to perform **level-order traversal**, where nodes are visited row by row from top to bottom, left to right.

---

## Algorithm Explanation

### How BFS Works:

1. **Initialize**: Start with the root node in a queue
2. **Dequeue**: Remove the front node from the queue and process it
3. **Process**: Print or process the current node's value
4. **Enqueue Children**: Add the current node's children (left and right) to the queue
5. **Repeat**: Continue until the queue is empty

### Key Characteristics:

- **Data Structure**: Uses a **Queue (FIFO - First In, First Out)**
- **Time Complexity**: O(n), where n is the number of nodes
- **Space Complexity**: O(w), where w is the maximum width (number of nodes at any level)
- **Order**: Level-by-level exploration

---

## Visualization

For a tree structure:
```
        5
       / \
      3   7
     / \ / \
    2  4 6  8
```

**BFS Level-Order Traversal Output**: `5 3 7 2 4 6 8`

**Step-by-step execution:**
- Step 1: Queue = [5] → Process 5 → Add 3, 7 → Output: 5
- Step 2: Queue = [3, 7] → Process 3 → Add 2, 4 → Output: 5 3
- Step 3: Queue = [7, 2, 4] → Process 7 → Add 6, 8 → Output: 5 3 7
- Step 4: Queue = [2, 4, 6, 8] → Process 2 → Output: 5 3 7 2
- Step 5: Queue = [4, 6, 8] → Process 4 → Output: 5 3 7 2 4
- Step 6: Queue = [6, 8] → Process 6 → Output: 5 3 7 2 4 6
- Step 7: Queue = [8] → Process 8 → Output: 5 3 7 2 4 6 8

---

## Core Logic

The implementation uses the following core logic:

```
runLevelOrder():
    if root is null:
        return
    
    create a Queue
    add root to queue
    
    while queue is not empty:
        current = queue.remove_front()
        process/print current.data
        
        if current.left exists:
            queue.add(current.left)
        
        if current.right exists:
            queue.add(current.right)
```

**Why a Queue?**
- The queue ensures FIFO behavior (First In, First Out)
- This maintains the level-order: nodes at the same level are dequeued before deeper levels
- If a stack (LIFO) were used instead, it would become depth-first search (DFS)

---

## Expected Output

When running BFS on the tree constructed with values: `5, 3, 7, 2, 4, 6, 8`

```
BFS (Level Order) Output; 5 3 7 2 4 6 8
```

The output shows:
- **5**: Root (level 0)
- **3, 7**: Level 1 (left and right children of root)
- **2, 4, 6, 8**: Level 2 (grandchildren, left to right)

---

## Key Methods

### 1. **insert(int data)**
- **Purpose**: Inserts a value into the BST structure
- **Parameters**: `data` - the integer value to insert
- **Logic**: Uses recursive insertion to maintain BST properties
- **Returns**: void
- **Time Complexity**: O(log n) average, O(n) worst case

### 2. **runLevelOrder()**
- **Purpose**: Performs BFS traversal and prints all nodes level by level
- **Parameters**: None
- **Logic**: 
  - Creates a queue and adds the root
  - Repeatedly dequeues nodes and enqueues their children
  - Prints each node as it's dequeued
- **Returns**: void
- **Time Complexity**: O(n) - visits each node once
- **Space Complexity**: O(w) - width of the tree

### 3. **insertRecursive(TreeNode current, int data)** (Private)
- **Purpose**: Helper method for recursive insertion
- **Parameters**: 
  - `current` - the current node in recursion
  - `data` - value to insert
- **Logic**: 
  - If current is null, create new node
  - If data < current.data, recursively insert to left
  - If data > current.data, recursively insert to right
  - Duplicates are ignored
- **Returns**: TreeNode - the (possibly new) subtree root
- **Time Complexity**: O(log n) average, O(n) worst case

---

## Use Cases

### 1. **Level-Order Traversal**
- Printing a tree level by level
- Representing trees in a hierarchical format
- Creating a visual representation of tree structure

### 2. **Shortest Path in Unweighted Graphs**
- Finding the shortest distance between two nodes
- GPS navigation systems (when all edges have equal weight)
- Network routing protocols

### 3. **Finding All Nodes at a Given Distance**
- Locating all nodes exactly k steps away from a source
- Network discovery and broadcasting
- Finding nodes within a radius in spatial data

### 4. **Checking Tree Properties**
- Verifying if a tree is balanced
- Finding the width of a tree
- Calculating the height/depth of a tree

### 5. **Social Network Analysis**
- Finding all users at a specific degree of separation
- Friend recommendation systems
- Community detection

### 6. **Puzzle Solving**
- Solving puzzles with breadth-first solution (e.g., Rubik's cube)
- Finding minimum moves needed to reach a goal state
- State-space exploration in AI

### 7. **Web Crawling**
- BFS from a starting website to explore related pages
- Ensuring all pages at one "distance" are explored before going deeper

---

## Advantages & Disadvantages

### Advantages:
✓ Finds shortest path in unweighted graphs/trees
✓ Complete - guarantees finding a solution if one exists
✓ Optimal - finds shortest path
✓ Good for exploring level structure

### Disadvantages:
✗ Requires more memory than DFS (stores all nodes at current level)
✗ Slower than DFS if target is deep
✗ Can be inefficient for trees with large width
✗ Slower for very deep trees compared to DFS
