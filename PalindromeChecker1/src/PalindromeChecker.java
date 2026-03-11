import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeChecker {
    public static void main(String[] args) {

        /**
         * ============================================================
         * MAIN CLASS - UseCase6PalindromeCheckerApp
         * ============================================================
         *
         * Use Case 6: Queue + Stack Based Palindrome Check
         *
         * Goal:
         * Demonstrate FIFO vs LIFO using Queue and Stack.
         *
         * Flow:
         * 1. Accept a string input from the user
         * 2. Enqueue characters into the queue
         * 3. Push characters into the stack
         * 4. Compare dequeue (queue) and pop (stack) characters
         * 5. Display the result
         *
         * Key Concepts Used:
         * - Queue (FIFO data structure)
         * - Enqueue & Dequeue Operations
         * - Stack vs Queue behavior (LIFO vs FIFO)
         * - Logical comparison of characters
         *
         * Data Structures: Queue, Stack
         *
         * @author Hemanth
         * @version 1.0
         */

        System.out.println("======================================");
        System.out.println("Welcome to Palindrome Checker System");
        System.out.println("Use Case 6: Queue + Stack Method");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both structures
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }

        scanner.close();
    }
}