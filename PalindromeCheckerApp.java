import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Text: ");
        String word = scanner.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome?: " + isPalindrome);

        
        scanner.close();


    }
}
