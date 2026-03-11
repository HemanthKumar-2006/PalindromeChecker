import java.util.Scanner;

public class PalindromeChecker {

    /**
     * ============================================================
     * MAIN CLASS - UseCase9PalindromeCheckerApp
     * ============================================================
     *
     * Use Case 9: Recursive Palindrome Checker
     *
     * Goal:
     * Check palindrome using recursion.
     *
     * Flow:
     * 1. Accept a string input from the user
     * 2. Use recursive function to compare start and end characters
     * 3. Stop recursion when base condition is reached
     * 4. Display the result
     *
     * Key Concepts Used:
     * - Recursion
     * - Base Condition
     * - Call Stack
     *
     * Data Structure: Call Stack
     *
     * @author Hemanth
     * @version 9.0
     */

    // Recursive method to check palindrome
    public static boolean isPalindrome(String word, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Check characters
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("Welcome to Palindrome Checker System");
        System.out.println("Use Case 9: Recursive Method");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        boolean result = isPalindrome(word, 0, word.length() - 1);

        // Display result
        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }

        scanner.close();
    }
}