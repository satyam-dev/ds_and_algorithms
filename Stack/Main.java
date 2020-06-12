import java.util.Stack;

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
    }
}