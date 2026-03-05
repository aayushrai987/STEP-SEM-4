import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        int n = input.length();

        Stack<Character> stack = new Stack<>();

        char[] queue = new char[n];
        int front = 0;
        int rear = 0;

        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue[rear++] = ch;
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {
            char fromStack = stack.pop();
            char fromQueue = queue[front++];

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}
