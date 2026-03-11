import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String word);
}

/**
 * Stack Strategy Implementation
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String word) {
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
}

/**
 * Deque Strategy Implementation
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * Context Class
 */
class PalindromeService {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String word) {
        return strategy.check(word);
    }
}

public class PalindromeChecker {

    public static void main(String[] args) {

        /**
         * ============================================================
         * MAIN CLASS - UseCase12PalindromeCheckerApp
         * ============================================================
         *
         * Use Case 12: Strategy Pattern for Palindrome Algorithms
         *
         * Goal:
         * Dynamically choose a palindrome algorithm.
         *
         * Flow:
         * 1. Define PalindromeStrategy interface
         * 2. Implement StackStrategy and DequeStrategy
         * 3. Inject strategy at runtime
         * 4. Execute palindrome check
         *
         * Key Concepts Used:
         * - Interface
         * - Polymorphism
         * - Strategy Pattern
         *
         * Data Structure: Varies per strategy
         *
         * @author Hemanth
         * @version 1.0
         */

        System.out.println("======================================");
        System.out.println("Welcome to Palindrome Checker System");
        System.out.println("Use Case 12: Strategy Pattern Method");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("Choose Algorithm:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeService service = new PalindromeService();

        if (choice == 1) {
            service.setStrategy(new StackStrategy());
        } else {
            service.setStrategy(new DequeStrategy());
        }

        boolean result = service.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }

        scanner.close();
    }
}