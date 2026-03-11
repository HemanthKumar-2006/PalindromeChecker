import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeChecker {
    public static void main(String[] args) {

        /**
         * ============================================================
         * MAIN CLASS - UseCase7PalindromeCheckerApp
         * ============================================================
         *
         * Use Case 7: Deque-Based Optimized Palindrome Checker
         *
         * Goal:
         * Use Deque to compare front and rear elements.
         *
         * Flow:
         * 1. Accept a string input from the user
         * 2. Insert characters into the deque
         * 3. Remove first and last characters
         * 4. Compare them until deque becomes empty
         * 5. Display the result
         *
         * Key Concepts Used:
         * - Deque (Double Ended Queue)
         * - Front and Rear Access
         * - Optimized Data Handling
         *
         * Data Structure: Deque
         *
         * @author Hemanth
         * @version 7.0
         */

        System.out.println("======================================");
        System.out.println("Welcome to Palindrome Checker System");
        System.out.println("Use Case 7: Deque Based Method");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Create deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
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