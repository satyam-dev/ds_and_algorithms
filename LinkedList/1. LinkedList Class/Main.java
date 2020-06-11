public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        System.out.println(ll.getKthFromEnd(1)); // 30
        System.out.println(ll.getKthFromEnd(3)); // 10
        // ll.print();

    }
}
