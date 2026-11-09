public class MyStack {
        private int[] items;
        private int top;

        // Constructor
        public MyStack(int capacity) {
            items = new int[capacity];
            top = -1;
        }

        // Push
        public void push(int value) {
            if (top == items.length - 1) {
                expandCapacity();
            }

            top++;
            items[top] = value;
        }

        // Pop
        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }

            int value = items[top];
            top--;

            return value;
        }

        // Check empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Expand capacity
        private void expandCapacity() {
            int[] newItems = new int[items.length * 2];

            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }

        // Stack size
        public int size() {
            return top + 1;
        }
    }
