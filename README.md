# Binary Search Tree (BST) - Java Implementation



## Project Overview

This project implements a Binary Search Tree (BST) in Java, designed to be compatible with the Java Collections API. It includes essential operations such as insertion, search, deletion, and various traversal methods. Additionally, the implementation provides utility functions to find the minimum and maximum values, check if the tree is balanced, and calculate the height of the tree.

### Key Features

1. **Insertion (`add`)**: Adds elements while maintaining the BST properties.
2. **Search (`search`)**: Finds and returns whether a value exists in the tree.
3. **Deletion (`delete`)**: Removes an element while maintaining the tree structure.
4. **Traversals**:
    - **In-Order Traversal (`inOrderTraversal`)**: Visits nodes in ascending order (left, root, right).
    - **Pre-Order and Post-Order Traversals** can be added similarly.
5. **Find Minimum (`findMin`)**: Returns the minimum value in the tree.
6. **Find Maximum (`findMax`)**: Returns the maximum value in the tree.
7. **Height Calculation (`height`)**: Calculates the height of the tree.
8. **Check Balance (`isBalanced`)**: Verifies if the tree is balanced.
9. **Tree Printing (`printTree`)**: Prints the tree structure visually.

## Prerequisites

- Java 8 or higher
- Maven

## Project Structure

```
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── org
│   │   │   │   └── example
│   │   │   │       └── App.java           # Main application entry point
│   │   │   │       └── bst
│   │   │   │           └── BinarySearchTree.java  # BST implementation
│   └── test
│       ├── java
│       │   └── org
│       │       └── example
│       │           └── BinarySearchTreeTest.java # Unit tests
└── pom.xml
```

## How to Run

### 1. Clone the repository:
```bash
git clone https://github.com/juaneortiz1/Labmaraton.git
cd Labmaraton
```

### 2. Build the project using Maven:
```bash
mvn clean install
```

### 3. Run the Application:
```bash
mvn exec:java -Dexec.mainClass="org.example.App"
```

### 4. Sample Output

![image](https://github.com/user-attachments/assets/0a46f11c-a20a-4f9d-84f3-585921457dee)

## Unit Testing

The project includes unit tests for the `BinarySearchTree` class.

To run the tests, use:
```bash
mvn test
```

### Sample Test Output:
![image](https://github.com/user-attachments/assets/d319b2f3-558c-48c0-9b30-039c8e0f24b1)

### Author: Juan Esteban Ortiz
