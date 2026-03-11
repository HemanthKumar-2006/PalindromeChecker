import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Goal:
 * Compare the performance of different palindrome algorithms.
 *
 * Flow:
 * 1. Accept a string input from the user
 * 2. Run multiple palindrome algorithms
 * 3. Capture execution time using System.nanoTime()
 * 4. Display the results
 *
 * Key Concepts Used:
 * - System.nanoTime()
 * - Algorithm comparison
 *
 * @author Hemanth
 * @version 1.0
 */

public class PalindromeChecker {

    // Method 1: Reverse String Method
    public static boolean reverseMethod(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    // Method 2: Two Pointer Method
    public static boolean twoPointerMethod(String word) {
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

    // Method 3: Stack Method
    public static boolean stackMethod(String word) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("Welcome to Palindrome Checker System");
        System.out.println("Use Case 13: Performance Comparison");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Reverse Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(word);
        long end1 = System.nanoTime();

        // Two Pointer Method
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(word);
        long end2 = System.nanoTime();

        // Stack Method
        long start3 = System.nanoTime();
        boolean result3 = stackMethod(word);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Two Pointer Method: " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Stack Method: " + result3 + " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}