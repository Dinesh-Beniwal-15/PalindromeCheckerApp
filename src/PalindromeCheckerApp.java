import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        boolean isPalindrome = true;

        for(int i = 0; i < chars.length / 2; i++) {
            if(chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome (Character Array Method)");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
}