package generics_06.stack;

public class StackRunner {
    static void main() {
        Stack<String> stack = new Stack<>(3);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.peek();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.pop();
    }
}
