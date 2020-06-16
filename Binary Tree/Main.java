class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(7);
        bt.insert(4);
        bt.insert(9);
        bt.insert(1);
        bt.insert(6);
        bt.insert(8);
        bt.insert(10);
        bt.insert(0);
        System.out.println("Done!"); // add a break point here and check the node in debugger
        System.out.println(bt.find(7));

        // Tree traversal -
        bt.traverseInOrder();
        System.out.println();
        bt.traversePostOrder();
        System.out.println();
        bt.traversePreOrder();
        System.out.println();
        System.out.println(bt.height());
        System.out.println(bt.min(true));

        // equals
        BinaryTree other = new BinaryTree();
        other.insert(7);
        other.insert(4);
        other.insert(9);
        other.insert(1);
        other.insert(6);
        other.insert(18);
        other.insert(10);
        other.insert(0);
        System.out.println(bt.equals(other));
    }
}