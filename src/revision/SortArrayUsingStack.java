package revision;

import java.util.Stack;

public class SortArrayUsingStack {
    public static void main(String[] args) {

        Stack<Integer> inputStack = new Stack<>();

        inputStack.add(15);
        inputStack.add(6);
        inputStack.add(1);
        inputStack.add(8);
        inputStack.add(2);
        inputStack.add(10);
        inputStack.add(3);
        inputStack.add(35);
        inputStack.add(5);

        System.out.println("Older unsorted array is: " + inputStack.toString());
        Stack<Integer> tempStack = new Stack<>();
        sortUsingStack(inputStack, tempStack);
        System.out.println("New sorted stack is: " + tempStack.toString());
    }

    public static void sortUsingStack(Stack<Integer> inputStack, Stack<Integer> tempStack) {
        while (!inputStack.isEmpty()) {
            Integer temp = inputStack.pop();

            while (!tempStack.isEmpty() && temp < tempStack.peek())
                inputStack.push(tempStack.pop());

            tempStack.push(temp);
        }
    }
}











