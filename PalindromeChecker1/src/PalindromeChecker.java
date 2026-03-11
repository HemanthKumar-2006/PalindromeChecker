import java.util.Scanner;
public class PalindromeChecker {
    public static  void main(String[]args){
/**
 * ============================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Goal:
 * Convert a string to a character array and check if it is a palindrome.
 *
 * Flow:
 * 1. Accept a string input from the user
 * 2. Convert the string to a char array
 * 3. Use two-pointer technique to compare characters
 * 4. Display the result
 *
 * Key Concepts Used:
 * - Character Array (char[])
 * - Array Indexing
 * - Two-Pointer Technique
 * - Efficient comparison without creating extra objects
 *
 * Data Structure: char[]
 *
 * @author Hemanth
 * @version 1.0
 */

                System.out.println("======================================");
                System.out.println("Welcome to Palindrome Checker System");
                System.out.println("Use Case 4: Character Array Method");
                System.out.println("======================================");

                Scanner scanner = new Scanner(System.in);

                // Accept input from user
                System.out.print("Enter a word: ");
                String word = scanner.nextLine();

                // Convert string to character array
                char[] characters = word.toCharArray();

                // Two-pointer technique
                int start = 0;
                int end = characters.length - 1;

                boolean isPalindrome = true;

                while (start < end) {
                    if (characters[start] != characters[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
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




