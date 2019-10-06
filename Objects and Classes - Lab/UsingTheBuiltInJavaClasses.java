package Lecutre6ObjectAndClasses;

import java.util.Random;
import java.util.Scanner;

public class UsingTheBuiltInJavaClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i <= words.length - 1; i++) {
            int firstIndex = random.nextInt(words.length);
            int nextIndex = random.nextInt(words.length);

            String swapWords = words[firstIndex];
            words[firstIndex] = words[nextIndex];
            words[nextIndex] = swapWords;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
