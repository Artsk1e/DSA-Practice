# Binary Search Tree (BST) & Depth-First Search (DFS) in Java

This repository contains a standard implementation of a Binary Search Tree (BST) featuring recursive data insertion and the three classic Depth-First Search (DFS) tree traversal algorithms: Pre-Order, In-Order, and Post-Order.

---

## Tree Visualization
When data is inserted sequentially in this exact order: **`10, 50, 30, 70, 20, 40`**, the logical structure of the tree in memory looks like this:

```text
          [ 10 ]               <-- Root Node
               \
              [ 50 ]           
             /      \
         [ 30 ]    [ 70 ]      
         /    \
      [ 20 ] [ 40 ]            
```

---

## Core Logic Cheat Sheet

### 1. The Gateway vs. The Worker (Insertion)
* **`public void insert(int data)`**: The public gateway called by `Main.java`. On the very first execution, its assignment line (`root = ...`) physically catches the first created node and locks it as the permanent **Root** of the tree.
* **`private TreeNode insertRecursive(...)`**: The hidden worker engine. It navigates down branches using recursion (Left if smaller, Right if larger) until it hits an empty spot (`null`), drops the new node, and links it back up.

### 2. DFS Traversal Execution Order
The only operational difference between the three algorithms is **when** the parent node's data is processed (`System.out.print`) relative to its left and right children.

* **Pre-Order** `(Root ➔ Left ➔ Right)`: Used for duplicating or cloning a tree structure.
* **In-Order** `(Left ➔ Root ➔ Right)`: Used to retrieve the data in perfect, sorted ascending order.
* **Post-Order** `(Left ➔ Right ➔ Root)`: Used for deleting nodes, freeing memory, or bottom-up evaluations.

---

## Expected Terminal Outputs

Given the sequence `10, 50, 30, 70, 20, 40`, compiling and executing the program will yield these exact console results:

| Traversal Type | Execution Pattern | Console Output |
| :--- | :--- | :--- |
| **Pre-Order** | Root processed **First** | `10 50 30 20 40 70` |
| **In-Order** | Root processed **Middle** | `10 20 30 40 50 70` |
| **Post-Order** | Root processed **Last** | `20 40 30 70 50 10` |

---
