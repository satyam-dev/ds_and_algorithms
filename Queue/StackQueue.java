import java.util.Stack;

public class StackQueue {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public StackQueue() {
        enqueueStack = new Stack<Integer>();
        dequeueStack = new Stack<Integer>();
    }

    public void add(int item) {
        enqueueStack.push(item);
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        moveEnqueueToDequeueStack();
        return dequeueStack.pop();
    }

    public int peek() {
        moveEnqueueToDequeueStack();
        return dequeueStack.peek();
    }

    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    private void moveEnqueueToDequeueStack() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty())
                dequeueStack.push(enqueueStack.pop());
        }
    }
}