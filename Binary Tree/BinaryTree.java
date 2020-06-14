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
}