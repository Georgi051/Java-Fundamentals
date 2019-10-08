package Lecutre8TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            if (text.contains(bannedWord)){
                String replace = repeatStr("*",bannedWord.length());
                text = text.replace(bannedWord,replace);
            }
        }
        System.out.println(text);
    }
    private static String repeatStr(String str, int length) {
        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement += str;
        }
        return replacement;
    }
}
