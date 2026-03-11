import java.util.Scanner;

class PalindromeService {

    /**
     * Method to check whether a string is a palindrome
     */
    public boolean checkPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeChecker {
    public static void main(String[] args) {

        /**
         * ============================================================
         * MAIN CLASS - UseCase11PalindromeCheckerApp
         * ============================================================
         *
         * Use Case 11: Object-Oriented Palindrome Service
         *
         * Goal:
         * Encapsulate palindrome logic inside a separate class.
         *
         * Flow:
         * 1. Create PalindromeService class
         * 2. Expose checkPalindrome() method
         * 3. Call the method from main class
         * 4. Display result
         *
         * Key Concepts Used:
         * - Encapsulation
         * - Single Responsibility Principle
         *
         * Data Structure: Internal (Array / Character comparison)
         *
         * @author Hemanth
         * @version 1.0
         */

        System.out.println("======================================");
        System.out.println("Welcome to Palindrome Checker System");
        System.out.println("Use Case 11: Object-Oriented Method");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Create object of service class
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(word);

        // Display result
        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }

        scanner.close();
    }
}