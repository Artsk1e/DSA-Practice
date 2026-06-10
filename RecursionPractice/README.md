# Recursion Practice

## Overview
Recursion is a programming technique where a function calls itself to solve problems by breaking them into smaller subproblems.

## Algorithm Explanation
- **Base Case**: Condition that stops the recursion
- **Recursive Case**: Function calls itself with modified parameters
- Each recursive call must move toward the base case
- Stack space grows with recursion depth

## Implementations

### Sum
```java
public static int sum(int n) {
    if (n <= 1) return 1;           // Base Case
    return n + sum(n-1);             // Recursive Call
}
// sum(5) = 5 + sum(4) = 5 + 4 + 3 + 2 + 1 = 15
```

### Factorial
```java
public static int factorial(int num) {
    if (num < 1) return 1;           // Base Case
    return num * factorial(num - 1);  // Recursive Call
}
// factorial(7) = 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040
```

### Power
```java
public static int power(int base, int exponent) {
    if (exponent < 1) return 1;      // Base Case
    return base * power(base, exponent-1);
}
// power(2, 8) = 2^8 = 256
```

### Fibonacci
```java
public static int fibonacci(int n) {
    if (n == 0) return 0;            // Base Case 1
    if (n == 1) return 1;            // Base Case 2
    return fibonacci(n-1) + fibonacci(n-2);
}
// fibonacci(5) = 0, 1, 1, 2, 3, 5
```

## Visualization
```
sum(5) Call Tree:
        sum(5)
        |
        5 + sum(4)
            |
            4 + sum(3)
                |
                3 + sum(2)
                    |
                    2 + sum(1)
                        |
                        1 (base case)

Result: 5 + 4 + 3 + 2 + 1 = 15
```

## Expected Output
```
The recursive sum of 5 is: 15
Factorial of 7: 5040
Power of 8 with a base of 2: 256
Fibonacci Sequence of 5: 5
```

## Core Logic
- Define base case (termination condition)
- Define recursive case (call with smaller input)
- Ensure convergence to base case

## Use Cases
- Tree traversal (DFS)
- Mathematical computations
- Backtracking algorithms
- Divide and conquer algorithms
- Graph traversal

## Important Notes
- Stack overflow risk with deep recursion
- Can be less efficient than iteration (repeated calculations)
- Memoization can optimize recursive solutions
