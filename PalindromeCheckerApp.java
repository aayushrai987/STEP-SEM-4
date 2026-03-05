import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        char[] deque = new char[input.length()];
        int front = 0;
        int rear = -1;

        for (char c : input.toCharArray()) {
            deque[++rear] = c;
        }

        boolean isPalindrome = true;

        while (front < rear) {
            if (deque[front] != deque[rear]) {
                isPalindrome = false;
                break;
            }
            front++;
            rear--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}
        sc.close();
    }
}
