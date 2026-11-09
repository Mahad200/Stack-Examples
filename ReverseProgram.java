public class ReverseProgram {
        // Reverse an array
        public static int[] reverseNumbers(int[] data) {

            MyStack myStack = new MyStack(2);

            // Push numbers
            for (int i = 0; i < data.length; i++) {
                myStack.push(data[i]);
            }

            // Create new array
            int[] answer = new int[data.length];

            // Pop numbers
            int index = 0;

            while (!myStack.isEmpty()) {
                answer[index] = myStack.pop();
                index++;
            }

            return answer;
        }

        // Main method
        public static void main(String[] args) {

            int[] numbers = {10, 20, 30, 40, 50};

            int[] reversedNumbers = reverseNumbers(numbers);

            System.out.println("Original Numbers:");

            for (int number : numbers) {
                System.out.print(number + " ");
            }

            System.out.println("\nReversed Numbers:");

            for (int number : reversedNumbers) {
                System.out.print(number + " ");
            }
        }
    }

