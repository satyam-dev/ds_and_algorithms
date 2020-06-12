import java.util.Arrays;

public class Stack {
    private int[] elements = new int[5];
    private int count;

    public void push(int element) {
        if (count == elements.length)
            throw new StackOverflowError();
        elements[count++] = element;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();
        return elements[--count];
    }

    public int peek() {
        if (count == 0)
            new IllegalStateException();
        return elements[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        int[] content = Arrays.copyOfRange(elements, 0, count);
        return Arrays.toString(content);
    }

}