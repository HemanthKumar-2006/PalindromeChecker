public class PalindromeChecker {
    public static  void main(String[]args){
        System.out.println("Welcome to palindrome checker management system");
        System.out.println("Version:1.0");
        System.out.println("System initialized sucessfully.");
    }
}

/**
 * ============================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 1: Application Entry & Welcome Message

 * The goal is to establish a clear startup flow.
 *
 * @author Hemanth
 * @version 1.0
 */
public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        // Check if palindrome
        if (word.equals(reversedWord)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
    }
}




