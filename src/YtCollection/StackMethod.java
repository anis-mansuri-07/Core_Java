package YtCollection;

import java.util.Stack;

public class StackMethod {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Grapes");
        stack.push("Watermelon");
        stack.push("Pineapple");
        stack.push("Mango");
        System.out.println(stack.search("Pineapple"));

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.contains("Apple"));
    }
}
