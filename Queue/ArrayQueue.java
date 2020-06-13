import java.util.Arrays;

public class ArrayQueue {
    private int[] elements;
    private int front; // front index
    private int rear; // rear index
    private int count;

    public ArrayQueue() {
        elements = new int[5];
    }

    public void add(int element) {
        if (isFull())
            throw new IllegalStateException();
        elements[rear] = element;
        rear = (rear + 1) % elements.length; // circular array
        count++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        int element = elements[rear];
        elements[front] = 0;
        front = (front + 1) % elements.length; // circular array
        count--;
        return element;
    }

    public int peek() {
        return elements[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == elements.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}