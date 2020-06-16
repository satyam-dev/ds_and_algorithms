public class BinaryTree {

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node: " + value;
        }
    }

    private Node root;

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

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) { // [root] left right
        if (root == null)
            return;
        System.out.print(root.value + " ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) { // left [root] right
        if (root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.print(root.value + " ");
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) { // left right [root]
        if (root == null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value + " ");
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int min(boolean isBST) {
        if (isBST)
            return minBST();
        return min(root);
    }

    private int minBST() { // Time complexity - O(logN)
        if (root == null)
            throw new IllegalStateException();
        Node current = root;
        while (current != null) {
            if (current.leftChild == null)
                return current.value;
            current = current.leftChild;
        }
        return -1;
    }

    private int min(Node root) { // O(N)
        if (root == null)
            return Integer.MAX_VALUE;
        if (isLeaf(root))
            return root.value;
        int left = min(root.leftChild);
        int right = min(root.rightChild);
        return Math.min(Math.min(left, right), root.value);
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public boolean equals(BinaryTree other) {
        if (other == null)
            return false;
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;
        if (first != null && second != null)
            return (first.value == second.value) && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        return false;
    }

}