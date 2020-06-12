
class Main {
    public static void main(String[] args) {
        // String reverse
        StringReverser strReverser = new StringReverser();
        System.out.println(strReverser.reverse("Satyam"));

        // Check if balanced expression
        BalancedExpression balancedExp = new BalancedExpression();
        Boolean val1 = balancedExp.isBalancedExpression("((<1+3>[console.log('Balanced!')]))");
        Boolean val2 = balancedExp.isBalancedExpression("(<{1+2}>){})console.log('Not balanced!');<()>]");

        System.out.println(val1 + " " + val2);

        // Stack Class using Arrays
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        System.out.println(stack.isEmpty());

        // Two Stacks in single array
        TwoStacks twoStack = new TwoStacks(5);
        twoStack.push1(2);
        twoStack.push2(3);
        twoStack.push2(5);
        twoStack.push1(4);
        System.out.println(twoStack.pop1());
        System.out.println(twoStack.pop2());
        System.out.println(twoStack);
    }
}