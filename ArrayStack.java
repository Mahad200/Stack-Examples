import java.util.Arrays;
import java.util.EmptyStackException;
public class ArrayStack<T> {

        private static final int DEFAULT_CAPACITY = 2;

        private int top;
        private T[] stack;

        public ArrayStack() {
            this(DEFAULT_CAPACITY);
        }

        public ArrayStack(int initialCapacity) {
            top = 0;
            stack = (T[]) new Object[initialCapacity];
        }

        public void push(T element) {
            if (size() == stack.length) {
                expandCapacity();
            }

            stack[top] = element;
            top++;
        }

        private void expandCapacity() {
            stack = Arrays.copyOf(stack, stack.length * 2);
        }

        public T pop() throws EmptyStackException {
            if (isEmpty()) {
                throw new EmptyStackException();
            }

            top--;

            T result = stack[top];
            stack[top] = null;

            return result;
        }

        public T peek() throws EmptyStackException {
            if (isEmpty()) {
                throw new EmptyStackException();
            }

            return stack[top - 1];
        }

        public int size() {
            return top;
        }

        public boolean isEmpty() {
            return top == 0;
        }

        public int capacity() {
            return stack.length;
        }
    }

void main() {
            ArrayStack<String> s = new ArrayStack<>();

            // Push elements
            s.push("A");
            s.push("B");

            System.out.println("Stack size: " + s.size());
            System.out.println("Stack capacity: " + s.capacity());

            // Push another element
            s.push("C");

            System.out.println("After pushing C:");
            System.out.println("Stack size: " + s.size());
            System.out.println("Stack capacity: " + s.capacity());

            // Peek element
            System.out.println("Top element: " + s.peek());

            // Pop elements
            System.out.println("Removed: " + s.pop());
            System.out.println("Removed: " + s.pop());
            System.out.println("Removed: " + s.pop());

            // Check stack
            System.out.println("Is stack empty? " + s.isEmpty());
        }

