package Lecutre8TextProcessing.exersice;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        char replace = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (replace != letter) {
                replace = letter;
                System.out.printf("%c", replace);
            }
        }
    }
}
