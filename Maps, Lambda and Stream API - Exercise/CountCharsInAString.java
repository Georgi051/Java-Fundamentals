package Lecutre7AssociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        LinkedHashMap<Character,Integer> data = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter != ' '){
                if (!data.containsKey(letter)){
                    data.put(letter,1);
                }else {
                    int value = data.get(letter) + 1;
                    data.put(letter,value);
                }
            }
        }
        data.entrySet().stream().forEach(e -> System.out.printf("%c -> %d%n",e.getKey(),e.getValue()));
    }
}
