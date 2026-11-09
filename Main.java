public class Main {
    public static void main(String[] args){
        MyStack stack = new MyStack(2);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display stack size
        System.out.println("Stack Size: " + stack.size());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Check if stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }}
