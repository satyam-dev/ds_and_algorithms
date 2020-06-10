public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addFirst(10);
        ll.removeLast();
        ll.removeFirst();
        ll.print();
        System.out.println(ll.indexOf(20));
        System.out.println(ll.contains(30));
        System.out.println(ll.size());
    }
}
