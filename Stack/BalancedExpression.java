import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
    private final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

    public boolean isBalancedExpression(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);
            if (isRightBracket(ch)) {
                if (stack.isEmpty() || !isBracketMatched(stack.pop(), ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftBracket(Character ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(Character ch) {
        return rightBrackets.contains(ch);
    }

    private boolean isBracketMatched(Character left, Character right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}