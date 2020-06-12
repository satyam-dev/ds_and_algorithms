import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);

        // ll.print();
        System.out.println(Arrays.toString(ll.getMiddleNode()));
    }
}
