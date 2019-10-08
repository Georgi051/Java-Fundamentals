package Lecutre8TextProcessing.exersice;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String first = text.substring(0, text.indexOf(" "));
        String second = text.substring(text.indexOf(" ") + 1);

        System.out.println(charMulty(first, second));
    }

    private static int charMulty(String first, String second) {
        int sum = 0;
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            sum += first.charAt(i) * second.charAt(i);
        }

        if (first.length() > second.length()) {
            for (int i = second.length(); i < first.length() ; i++) {
                sum += first.charAt(i);
            }
        }else {
            for (int i = first.length(); i < second.length() ; i++) {
                sum += second.charAt(i);
            }
        }
        return sum;
    }
}
