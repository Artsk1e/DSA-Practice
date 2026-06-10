# Task Priority

## Overview
Task Priority system manages tasks with different priority levels. Higher priority tasks are executed before lower priority ones.

## Algorithm Explanation
- Each task has: name, description, and priority level
- **Add Task**: Insert task maintaining priority order
- **Execute Task**: Remove and execute highest priority task
- **View Tasks**: Display tasks sorted by priority
- Usually implemented with Priority Queue or sorted list
- Time Complexity: O(n) for insertion, O(1) for extraction
- Space Complexity: O(n)

## Visualization
```
Task Queue (sorted by priority):
Priority 1: [Critical Bug Fix]
Priority 2: [Feature Development]
Priority 3: [Documentation]
Priority 4: [Code Review]

After executing critical task:
Priority 2: [Feature Development]
Priority 3: [Documentation]
Priority 4: [Code Review]

After adding urgent task:
Priority 1: [Security Patch]
Priority 2: [Feature Development]
Priority 3: [Documentation]
Priority 4: [Code Review]
```

## Core Logic
```java
public void addTask(Task task) {
    // Insert task in priority order
    // Higher priority -> executed first
}

public Task executeTask() {
    // Remove and return highest priority task
}

public void displayTasks() {
    // Show all tasks sorted by priority
}
```

## Expected Output
```
Task added: Critical Bug Fix (Priority: 1)
Task added: Feature Development (Priority: 2)
Executing: Critical Bug Fix
Remaining tasks:
  Feature Development (Priority: 2)
```

## Key Methods
- `addTask(Task task)` - Add task with priority
- `executeTask()` - Execute highest priority task
- `displayTasks()` - Show all tasks

## Use Cases
- To-do list applications
- Project management tools
- Operating system scheduling
- Job queue management
- Hospital triage systems
