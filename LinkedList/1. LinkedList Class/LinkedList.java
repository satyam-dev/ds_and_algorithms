import sun.security.ec.point.Point;

public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first; // head
    private Node last; // tail
    private int size;

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) { // empty LinkedList
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int value) {
        Node subjectNode = first;
        int index = 0;
        while (subjectNode != null) {
            if (subjectNode.value == value)
                return index;
            subjectNode = subjectNode.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("LinkedList is Empty!");
            return;
        }

        if (first == last)
            first = last = null;
        else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;

    }

    public void removeLast() {
        // find second last element
        if (isEmpty()) {
            System.out.println("LinkedList is Empty!");
            return;
        }
        if (first == last)
            first = last = null;
        else {
            Node previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;

    }

    public int size() {
        return size;
    }

    public void reverse() {
        // f l
        // [10] <-- [20] <--[30] --> null
        // p c n
        // n = c.next
        // c.next = p
        // p = c
        // c = n

        if (isEmpty())
            return;
        Node previous = first;
        Node current = first.next;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;

    }

    public int getKthFromEnd(int k) {
        // pointers p1,p2 |<----d=k-1--->|
        // 10 --> 20 --> 30 --> 40 --> 50
        // k = 5 4 3 2 1
        if (isEmpty())
            throw new IllegalStateException();
        Node p1 = first;
        Node p2 = first;
        for (int i = 0; i < k - 1; i++) {
            p2 = p2.next;
            if (p2 == null)
                throw new IllegalArgumentException();
        }
        while (p2 != last) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.value;
    }

    public int[] getMiddleNode() {

        // p1 p2
        // 10 20 30 40 50 60 70 80 90

        // p1 p2
        // 10 20 30 40 50 60 70 80 90

        // p1 p2
        // 10 20 30 40 50 60 70 80 90

        // p1 p2
        // 10 20 30 40 50 60 70 80 90
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        if (first == last) {
            int[] middle = { first.value };
            return middle;
        }
        Node p1 = first;
        Node p2 = first;
        while (p2 != last) { // stop when p2 hits the tail
            if (p2.next.next == null) { // check if even
                int[] middle = { p1.value, p1.next.value };
                return middle;
            }
            p1 = p1.next; // move p1 1 step ahead
            p2 = p2.next.next; // move p2 2 steps ahead
        }

        int[] middle = { p1.value };
        return middle;
    }

    public void print() {
        int[] arr = new int[10];
        Node subjectNode = first;
        while (subjectNode != null) {
            System.out.println(subjectNode.value);
            subjectNode = subjectNode.next;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

}