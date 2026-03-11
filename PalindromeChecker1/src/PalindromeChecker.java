import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {

        /**
         * ============================================================
         * MAIN CLASS - UseCase5PalindromeCheckerApp
         * ============================================================
         *
         * Use Case 5: Stack-Based Palindrome Checker
         *
         * Goal:
         * Use a stack to reverse characters and validate palindrome.
         *
         * Flow:
         * 1. Accept a string input from the user
         * 2. Push characters into the stack
         * 3. Pop characters and build reversed string
         * 4. Compare original and reversed string
         * 5. Display result
         *
         * Key Concepts Used:
         * - Stack (LIFO data structure)
         * - Push Operation
         * - Pop Operation
         * - Reversal Logic using Stack
         *
         * Data Structure: Stack
         *
         * @author Hemanth
         * @version 1.0
         */

        System.out.println("======================================");
        System.out.println("Welcome to Palindrome Checker System");
        System.out.println("Use Case 5: Stack Based Method");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to create reversed string
        String reversedWord = "";

        while (!stack.isEmpty()) {
            reversedWord += stack.pop();
        }

        // Compare original and reversed string
        if (word.equals(reversedWord)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }

        scanner.close();
    }
}



