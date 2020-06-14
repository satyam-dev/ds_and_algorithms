import java.util.Arrays;

public class PriorityQueue {
    private int[] elements;
    private int count;

    public PriorityQueue(int capacity) {
        elements = new int[capacity];
    }

    public void add(int element) {
        if (isFull())
            throw new IllegalStateException();
        int index = shiftItemsToAdd(element);
        elements[index] = element;
        count++;
    }

    private int shiftItemsToAdd(int element) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (element < elements[i])
                elements[i + 1] = elements[i];
            else
                break;
        }
        return i + 1;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        int element = elements[count - 1];
        elements[--count] = 0;
        return element;
    }

    public boolean isFull() {
        return elements.length == count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}