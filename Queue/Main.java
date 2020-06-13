import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        // System.out.println(queue);

        // Array Queue
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.add(10);
        arrayQueue.add(20);
        arrayQueue.add(30);
        arrayQueue.add(40);
        arrayQueue.remove();
        arrayQueue.add(50);
        arrayQueue.add(60);
        // System.out.println(arrayQueue);
        // System.out.println(arrayQueue.peek());
        // System.out.println(arrayQueue.isFull());

        // StackQueue
        StackQueue stackQueue = new StackQueue();
        stackQueue.add(10);
        stackQueue.add(20);
        stackQueue.add(30);
        stackQueue.remove();
        System.out.println(stackQueue.peek());
        System.out.println(stackQueue.isEmpty());
    }

    private static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<Integer>();
        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

    }
}