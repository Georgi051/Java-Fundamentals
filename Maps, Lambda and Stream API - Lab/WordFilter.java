package Lecutre7AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

            Arrays.stream(words)
                .filter(e -> e.length() % 2 == 0)
                    .forEach(System.out::println);
    }
}
