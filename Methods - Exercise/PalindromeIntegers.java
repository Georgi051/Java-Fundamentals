package Lecture4Methods.exersise;

        import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            isPalindrome(input);
            input =scanner.nextLine();
        }
    }

    static void isPalindrome(String input) {
        String[] digit = input.split("");
        int first = Integer.parseInt(digit[0]);
        int last = Integer.parseInt(digit[digit.length - 1]);

        if (first == last) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
