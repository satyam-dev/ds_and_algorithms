# Data Structures and Algorithms

## Non Linear Data Structures - 

- Binary Trees
- AVL Trees
- Heaps
- Tries
- Graphs

### Binary Trees

**Binary Tree - Defination**

>Trees are the data structures that stores elements in a hierarchy. Theses elements are refered as **nodes** and lines that connects them as **edges**. When each node has maximum of 2 children nodes, we refere to these as Binary trees.

**Binary Search Tree - Defination** 

>BST is a special type of binary tree, in which value of each node is smaller than its right child and larger than its left child(left < node < right)
> - Lookup time in BST - **O(log n)**
> - Insert time in BST - **O(log n)**
> - Delete time in BST - **O(log n)**

### Tree Problems

**#Problem 1:**

 Build a BST from scratch. Add *insert* and *find* functionalities.
 - **insert** - Takes a int value and insert a node with that value at the right location in a BST
 - **find** - Takes a int value and search for a node corresponding to that value and returns true if node is found, otherwise false

*#Solution 1:* 

Define a **Node** class - 

```java
private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }
```

Define a **BinaryTree** class - 

```java
public class BinaryTree {

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value) {
    // insert a node
    }

    public boolean find(int value) {
    // find a node
    }
}

```

Define **insert** method - 

```java
    public void insert(int value) {
        Node node = new Node(value);
        if (root == null)
            root = node;
        else {
            Node current = root;
            while (true) {
                if (value < current.value) {
                    // go left
                    if (current.leftChild == null) {
                        current.leftChild = node;
                        break;
                    }
                    current = current.leftChild;
                } else {
                    // go right
                    if (current.rightChild == null) {
                        current.rightChild = node;
                        break;
                    }
                    current = current.rightChild;
                }
            }
        }
    }
```

Define **find** method - 

```java
    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (current.value == value)
                return true;

            if (value < current.value)
                current = current.leftChild;
            else
                current = current.rightChild;
        }
        return false;
    }
```
---

**Tree Traversal** 

>Tree traversal in simple tearms means *walking the tree*. Traversals can be broadly done in 2 ways -
> - **Breadth first** - Also known as level order traversal, we visit all the nodes at same level before visiting the nodes at next level. 
> - **Depth first** - There are mainly 3 ways in which we achieve Depth first traversal
>   - Pre-order - **Root**, *Left*, *Right*
>   - In-order - *Left*, **Root**, *Right*
>   - Post-order - *Left*, *Right*, **Root**

