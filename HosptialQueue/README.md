# Hospital Queue (ER Priority Queue)

## Overview
A Hospital Queue (ER Priority Queue) manages patient treatment prioritization in an Emergency Room based on severity of condition.

## Algorithm Explanation
- Each patient has: name, condition, and priority level
- **Admit Patient**: Add to queue with priority
- **Treat Patient**: Remove highest priority patient
- **Display Queue**: Show patients sorted by priority
- Critical/Severe conditions get higher priority
- Time Complexity: O(log n) for insertion and extraction
- Space Complexity: O(n)

## Visualization
```
ER Priority Queue:
Priority 1 (Critical): [Patient A - Heart Attack]
Priority 2 (Severe):   [Patient B - Fracture]
Priority 3 (Moderate): [Patient C - Fever]
Priority 4 (Minor):    [Patient D - Bruise]

After treating Patient A:
Priority 2 (Severe):   [Patient B - Fracture]
Priority 3 (Moderate): [Patient C - Fever]
Priority 4 (Minor):    [Patient D - Bruise]

After admitting Patient E (Critical):
Priority 1 (Critical): [Patient E - Stroke]
Priority 2 (Severe):   [Patient B - Fracture]
Priority 3 (Moderate): [Patient C - Fever]
Priority 4 (Minor):    [Patient D - Bruise]
```

## Core Logic
```java
public void admitPatient(String name, String condition, int priority) {
    // Add patient to queue with priority
}

public void treatPatient() {
    // Remove and treat highest priority patient
}

public void displayQueue() {
    // Show patients sorted by priority
}
```

## Expected Output
```
Admitted: Patient A (Heart Attack - Critical)
Admitted: Patient B (Fracture - Severe)
Treating: Patient A - Heart Attack
Next patient: Patient B - Fracture
```

## Key Methods
- `admitPatient(String name, String condition, int priority)` - Add patient
- `treatPatient()` - Treat next patient
- `displayQueue()` - Show patient queue

## Use Cases
- Emergency room management
- Hospital patient scheduling
- Medical triage systems
- 911 dispatch centers
- Medical facility resource allocation
