import java.util.Arrays;

public class TwoStacks {
    private int[] elements;
    private int top1;
    private int top2;

    public TwoStacks(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Invalid capacity! Must me 1 or");
        elements = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    public void push1(int element) {
        if (isFull1())
            throw new IllegalStateException();
        elements[++top1] = element;
    }

    public void push2(int element) {
        if (isFull2())
            throw new IllegalStateException();
        elements[--top2] = element;
    }

    public int pop1() {
        if (isEmpty1())
            throw new IllegalStateException();
        return elements[top1--];
    }

    public int pop2() {
        if (isEmpty2())
            throw new IllegalStateException();
        return elements[top2++];
    }

    public boolean isEmpty1() {
        return top1 == -1;
    }

    public boolean isEmpty2() {
        return top2 == elements.length;
    }

    public boolean isFull1() {
        return (top1 + 1) == top2;
    }

    public boolean isFull2() {
        return (top2 - 1) == top1;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

}