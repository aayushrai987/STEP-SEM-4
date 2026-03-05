import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        endTime = System.nanoTime();
        long time1 = endTime - startTime;

        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        startTime = System.nanoTime();
        boolean result3 = recursiveCheck(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

        System.out.println("\nInput : " + input);

        System.out.println("\nTwo Pointer Result : " + result1);
        System.out.println("Execution Time (ns) : " + time1);

        System.out.println("\nStack Result : " + result2);
        System.out.println("Execution Time (ns) : " + time2);

        System.out.println("\nRecursive Result : " + result3);
        System.out.println("Execution Time (ns) : " + time3);

        sc.close();
    }

    static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean stackCheck(String input) {

        char[] stack = new char[input.length()];
        int top = -1;

        for (int i = 0; i < input.length(); i++) {
            stack[++top] = input.charAt(i);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack[top--]) {
                return false;
            }
        }

        return true;
    }

    static boolean recursiveCheck(String input, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return recursiveCheck(input, start + 1, end - 1);
    }
}
