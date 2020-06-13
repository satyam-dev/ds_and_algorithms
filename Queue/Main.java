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
        ArrayQueue arque = new ArrayQueue();
        arque.add(10);
        arque.add(20);
        arque.add(30);
        arque.add(40);
        arque.remove();
        arque.add(50);
        arque.add(60);
        System.out.println(arque);
        System.out.println(arque.peek());
        System.out.println(arque.isFull());
    }

    private static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<Integer>();
        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

    }
}