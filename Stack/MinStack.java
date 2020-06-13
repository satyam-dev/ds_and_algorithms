import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public int min() {
        return minStack.peek();
    }

    public void push(int item) {
        stack.push(item);
        if (minStack.isEmpty())
            minStack.push(item);
        else if (minStack.peek() >= item)
            minStack.push(item);
    }

    public int pop() {
        if (stack.isEmpty())
            throw new IllegalArgumentException();
        int top = stack.pop();
        if (top == minStack.peek())
            minStack.pop();
        return top;
    }
}