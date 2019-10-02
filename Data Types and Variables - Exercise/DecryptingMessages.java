package Lacture2.MoreExercise1;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String decriptWord = "";
        for (int i = 0; i < n; i++) {
            String character = scanner.nextLine();
            char chars = character.charAt(0);
            int charValuePlusKey = chars + key;
            char decriptCharacter = (char) charValuePlusKey;

            decriptWord += decriptCharacter;
        }
        System.out.println(decriptWord);
    }
}
