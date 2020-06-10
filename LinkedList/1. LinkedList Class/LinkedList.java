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

    public void print() {
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