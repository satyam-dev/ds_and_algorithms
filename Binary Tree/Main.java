class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(7);
        System.out.println("Done!"); // add a break point here and check the node in debugger
        System.out.println(bt.find(7));
    }
}