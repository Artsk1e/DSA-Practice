# Depth First Search (DFS)

## Overview
Depth First Search is a graph traversal algorithm that explores as far as possible along each branch before backtracking.

## Algorithm Explanation
- Start from a node
- Visit the node and mark as visited
- Recursively visit all unvisited neighbors
- Backtrack when no unvisited neighbors exist
- Time Complexity: O(V + E) where V = vertices, E = edges
- Space Complexity: O(V) for visited set and recursion stack

## Visualization
```
Graph:
    1 --- 2
    |     |
    3 --- 4

DFS starting from 1:
Visit 1 -> Visit 3 -> Visit 4 -> Visit 2
(or other valid DFS order depending on adjacency)

Traversal order: [1, 3, 4, 2]
```

## Core Logic
```java
public void dfs(Node root) {
    if (root == null) return;
    
    visited.add(root);
    System.out.print(root.value + " ");
    
    for (Node neighbor : root.neighbors) {
        if (!visited.contains(neighbor)) {
            dfs(neighbor);           // Recursive call
        }
    }
}
```

## Expected Output
```
DFS Traversal: 1 3 4 2
(exact order may vary based on implementation)
```

## Key Methods
- `dfs(Node node)` - Main DFS traversal
- `visit(Node node)` - Mark node as visited

## Use Cases
- Topological sorting
- Detecting cycles in a graph
- Finding connected components
- Solving maze problems
- Strongly connected components (Tarjan's algorithm)
- Backtracking problems
