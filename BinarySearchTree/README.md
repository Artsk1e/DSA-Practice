# Binary Search Tree (BST)

## Overview

A **Binary Search Tree (BST)** is a self-organizing, hierarchical data structure that maintains sorted data efficiently. Each node contains a value and has at most two children (left and right). The fundamental property is that for every node:
- All values in the **left subtree** are smaller than the node's value
- All values in the **right subtree** are greater than the node's value

This property enables efficient searching, insertion, and deletion operations, making BSTs ideal for maintaining sorted datasets and implementing search algorithms.

---

## Algorithm Explanation

### BST Properties:

1. **Binary Property**: Each node has at most 2 children (left and right)
2. **Ordering Property**: Left child value < Parent value < Right child value
3. **Recursive Property**: Each subtree is also a BST
4. **No Duplicates**: Equal values are typically ignored in this implementation

### Core Operations:

#### **Insertion Algorithm:**
```
insert(value):
    if tree is empty:
        create root node with value
    else:
        call insertRecursive(root, value)

insertRecursive(current, value):
    if current is null:
        return new node with value
    
    if value < current.value:
        current.left = insertRecursive(current.left, value)
    else if value > current.value:
        current.right = insertRecursive(current.right, value)
    else:
        duplicate - ignore
    
    return current
```

#### **Search Algorithm:**
```
search(target):
    current = root
    
    while current is not null:
        if target == current.value:
            return true (found)
        else if target < current.value:
            current = current.left
        else:
            current = current.right
    
    return false (not found)
```

#### **In-Order Traversal Algorithm:**
```
inOrder(node):
    if node is not null:
        inOrder(node.left)        // Visit left subtree
        process(node)              // Process current node
        inOrder(node.right)        // Visit right subtree
```

**Result**: Nodes are visited in sorted (ascending) order

### Time & Space Complexity:

| Operation | Average Case | Worst Case | Notes |
|-----------|--------------|------------|-------|
| **Insert** | O(log n) | O(n) | Worst case: skewed tree (linked list) |
| **Search** | O(log n) | O(n) | Worst case: completely unbalanced |
| **In-Order Traversal** | O(n) | O(n) | Must visit all nodes |
| **Space (avg)** | O(log n) | O(n) | Recursion stack depth |

---

## Visualization

### Example BST Structure:
```
Insert sequence: 5, 3, 7, 2, 4, 6, 8

        5
       / \
      3   7
     / \ / \
    2  4 6  8
```

### Binary Search Tree Property Verification:
- Node **5**: Left subtree (3, 2, 4) all < 5; Right subtree (7, 6, 8) all > 5 ✓
- Node **3**: Left subtree (2) < 3; Right subtree (4) > 3 ✓
- Node **7**: Left subtree (6) < 7; Right subtree (8) > 7 ✓

### Search Example:
Finding **4**:
- Start at 5: 4 < 5, go left
- At 3: 4 > 3, go right
- At 4: 4 == 4, Found! ✓

### In-Order Traversal Path:
```
Start → 2 → 3 → 4 → 5 → 6 → 7 → 8
(completely sorted output!)
```

---

## Core Logic

### Data Structure: TreeNode
```
TreeNode:
    - data: the integer value stored
    - left: reference to left child
    - right: reference to right child
```

### BST Class Components:
1. **root**: The topmost node of the tree
2. **insert()**: Public method to add values
3. **insertRecursive()**: Recursive helper for insertion
4. **search()**: Iterative method to find a value
5. **printInOrder()**: Public method to display sorted values
6. **inOrderRecursive()**: Recursive helper for traversal

### Why This Design?
- **Recursive Insertion**: Naturally follows tree structure, maintains BST property automatically
- **Iterative Search**: Efficient without stack overhead, easier to trace path taken
- **Recursive Traversal**: Naturally expresses left-root-right pattern

---

## Expected Output

### Example 1: Basic Operations
```
Insert: 5, 3, 7, 2, 4, 6, 8
Search 4: true
Search 10: false
Sorted Tree Data In-Order: 
2 3 4 5 6 7 8
```

### Example 2: Another Sequence
```
Insert: 50, 30, 70, 20, 40, 60, 80
Search 40: true
Search 100: false
Sorted Tree Data In-Order: 
20 30 40 50 60 70 80
```

### Output Characteristics:
- In-order traversal always produces **sorted ascending** output
- Search returns true/false for presence/absence
- Reflects the hierarchical insertion order in tree structure

---

## Key Methods

### 1. **insert(int data)**
- **Purpose**: Add a new value to the BST
- **Parameters**: `data` - integer value to insert
- **Logic**: Delegates to insertRecursive()
- **Returns**: void
- **Time Complexity**: O(log n) average, O(n) worst case
- **Space Complexity**: O(log n) average (recursion depth)

### 2. **insertRecursive(TreeNode current, int data)** (Private)
- **Purpose**: Recursively find correct position and insert node
- **Parameters**: 
  - `current` - current node in recursion
  - `data` - value to insert
- **Logic**: 
  - If current is null, create new TreeNode
  - If data < current.data, recurse left
  - If data > current.data, recurse right
  - If data == current.data, ignore (no duplicates)
- **Returns**: TreeNode - the subtree root (new or existing)
- **Time Complexity**: O(log n) average, O(n) worst case

### 3. **search(int target)**
- **Purpose**: Determine if a value exists in the BST
- **Parameters**: `target` - value to search for
- **Logic**: 
  - Start at root
  - If target matches current node, return true
  - If target < current, move left
  - If target > current, move right
  - Continue until found or reach null
- **Returns**: boolean - true if found, false otherwise
- **Time Complexity**: O(log n) average, O(n) worst case
- **Space Complexity**: O(1) - iterative, no extra space

### 4. **printInOrder()**
- **Purpose**: Display all values in sorted order
- **Parameters**: None
- **Logic**: Delegates to inOrderRecursive() starting from root
- **Returns**: void
- **Output**: Prints all values in ascending sorted order
- **Time Complexity**: O(n)

### 5. **inOrderRecursive(TreeNode current)** (Private)
- **Purpose**: Recursively traverse and print in sorted order
- **Parameters**: `current` - current node
- **Logic**: 
  - Process left subtree first
  - Print current node
  - Process right subtree last
- **Returns**: void
- **Time Complexity**: O(n) - visits all n nodes
- **Space Complexity**: O(h) - recursion stack (h = height)

---

## Use Cases

### 1. **Sorted Data Maintenance**
- Maintaining sorted lists dynamically (insertions/deletions)
- Priority queues implementation
- Database indexing structures (B-trees extend this concept)

### 2. **Search Operations**
- Fast lookup in sorted data
- Autocomplete suggestions (prefix trees)
- Symbol tables in compilers and interpreters

### 3. **Efficient Ranges**
- Finding all elements in a range [min, max]
- Range queries: "Find all salaries between $50K and $100K"
- Database queries with multiple conditions

### 4. **Duplicate Detection**
- Finding duplicate values in a dataset
- Removing duplicates while maintaining order
- Frequency counting

### 5. **Expression Parsing**
- Parsing mathematical expressions
- Compiler design (expression trees)
- Abstract syntax trees (AST)

### 6. **File System Implementation**
- Directory structures
- File indexing systems
- Hierarchical data organization

### 7. **Game Development**
- Spatial partitioning (BSP trees)
- Collision detection structures
- Game AI decision trees

### 8. **Auto-Complete Systems**
- Trie (special case of tree) for word storage
- Predictive text input
- Search suggestions

---

## Tree Balance Considerations

### Balanced BST:
```
Tree with 7 nodes:
        4          Height = 3
       / \
      2   6
     / \ / \
    1  3 5  7

Height = ⌈log₂(n+1)⌉ ≈ log₂(n)
Performance: O(log n) for all operations
```

### Unbalanced (Skewed) BST:
```
Linear sequence:
1
 \
  2
   \
    3
     \
      4
       \
        5

Height = n
Performance: O(n) for all operations (becomes linked list!)
```

### Solutions to Imbalance:
- **Self-Balancing Trees**: AVL trees, Red-Black trees
- **Random insertion**: Usually produces acceptable balance
- **Rebalancing**: Restructure tree to minimize height

---

## Advantages & Disadvantages

### Advantages:
✓ O(log n) average search/insert/delete
✓ Maintains sorted order automatically
✓ Better than arrays for frequent insertions
✓ Better than linked lists for searching
✓ Can iterate in order efficiently
✓ Range queries are efficient

### Disadvantages:
✗ O(n) worst case if unbalanced
✗ More memory than arrays (pointers)
✗ No random access to elements
✗ Cache-unfriendly (scattered memory locations)
✗ Requires proper balancing for optimal performance
✗ Complex implementation for production use
