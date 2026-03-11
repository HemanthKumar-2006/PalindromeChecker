import java.util.Scanner;
public class PalindromeChecker {
    public static  void main(String[]args){
/**
 * ============================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Goal:
 * Check whether a string is a palindrome by reversing it.
 *
 * Flow:
 * 1. Accept a string input from the user
 * 2. Reverse the string using a for loop
 * 3. Compare original string and reversed string
 * 4. Display the result
 *
 * Key Concepts Used:
 * - For Loop (iterate through string in reverse order)
 * - String Immutability
 * - String Concatenation (+)
 * - equals() method for content comparison
 *
 * Data Structure: String
 *
 * @author Hemanth
 * @version 3.0
 */



                System.out.println("======================================");
                System.out.println("Welcome to Palindrome Checker System");
                System.out.println("Use Case 3: Reverse String Method");
                System.out.println("======================================");

                Scanner scanner = new Scanner(System.in);

                // Accept input from user
                System.out.print("Enter a word: ");
                String word = scanner.nextLine();

                // Reverse the string using for loop
                String reversedWord = "";

                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord = reversedWord + word.charAt(i);
                }

                // Check if palindrome
                if (word.equals(reversedWord)) {
                    System.out.println(word + " is a Palindrome.");
                } else {
                    System.out.println(word + " is not a Palindrome.");
                }

                scanner.close();
            }
        }






