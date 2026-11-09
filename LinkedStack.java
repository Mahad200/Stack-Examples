import java.util.EmptyStackException;

public class LinkedStack<T> {

    private int count;
    private Node<T> top;

    public LinkedStack() {
        count = 0;
        top = null;
    }

    public void push(T element) {
        Node<T> temp = new Node<>(element);
        temp.setNext(top);
        top = temp;
        count++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T result = top.getElement();
        top = top.getNext();
        count--;

        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.getElement();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}

void main() {

            LinkedStack<Integer> stack = new LinkedStack<>();

            // Push elements
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            System.out.println("Stack size: " + stack.size());

            // Peek
            System.out.println("Top element: " + stack.peek());

            // Pop
            System.out.println("Removed: " + stack.pop());

            System.out.println("New top: " + stack.peek());

            System.out.println("Stack size: " + stack.size());

            // Check empty
            System.out.println("Is empty: " + stack.isEmpty());
        }
