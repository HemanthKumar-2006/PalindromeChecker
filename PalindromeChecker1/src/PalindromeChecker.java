import java.util.Scanner;

public class PalindromeChecker {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        /**
         * ============================================================
         * MAIN CLASS - UseCase8PalindromeCheckerApp
         * ============================================================
         *
         * Use Case 8: Linked List Based Palindrome Checker
         *
         * Goal:
         * Check palindrome using singly linked list.
         *
         * Flow:
         * 1. Convert string to linked list
         * 2. Find middle using fast and slow pointer
         * 3. Reverse second half of the list
         * 4. Compare first and second halves
         *
         * Key Concepts Used:
         * - Singly Linked List
         * - Node Traversal
         * - Fast and Slow Pointer Technique
         * - In-Place Reversal
         *
         * Data Structure: Singly Linked List
         *
         * @author Hemanth
         * @version 1.0
         */

        System.out.println("======================================");
        System.out.println("Welcome to Palindrome Checker System");
        System.out.println("Use Case 8: Linked List Method");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Convert string to linked list
        Node head = null;
        Node tail = null;

        for (int i = 0; i < word.length(); i++) {
            Node newNode = new Node(word.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Find middle using fast and slow pointers
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Compare first half and reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;

        boolean isPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
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