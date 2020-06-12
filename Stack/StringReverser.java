import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();
        StringBuffer reverse = new StringBuffer(); // Efficient in string manipulations
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray())
            stack.push(ch);

        while (!stack.empty())
            reverse.append(stack.pop());
        return reverse.toString();
    }
}