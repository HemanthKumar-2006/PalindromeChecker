import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        /**
         * ============================================================
         * MAIN CLASS - UseCase10PalindromeCheckerApp
         * ============================================================
         *
         * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
         *
         * Goal:
         * Ignore spaces and case while checking whether a string
         * is a palindrome.
         *
         * Flow:
         * 1. Accept a string input from the user
         * 2. Normalize the string (remove spaces and convert to lowercase)
         * 3. Reverse the processed string
         * 4. Compare original processed string and reversed string
         * 5. Display the result
         *
         * Key Concepts Used:
         * - String preprocessing
         * - Regular expressions
         *
         * Data Structure: String / Array
         *
         * @author Hemanth
         * @version 1.0
         */

        System.out.println("======================================");
        System.out.println("Welcome to Palindrome Checker System");
        System.out.println("Use Case 10: Case-Insensitive Method");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the normalized string
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("\"" + input + "\" is not a Palindrome.");
        }

        scanner.close();
    }
}