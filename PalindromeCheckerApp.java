import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Text: ");
        String word = scanner.nextLine();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("Is it a Palindrome? True");
        } else {
            System.out.println("Is it a Palindrome? False");
        }
        scanner.close();
    }
}
